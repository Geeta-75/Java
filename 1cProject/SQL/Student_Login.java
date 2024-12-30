import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Student_Login {

    static Scanner sc = new Scanner(System.in);

    public static void login() {

        working();
    }

    public static void working() {

        Connection con = null;
        try {
            // step:1 load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // step:2 create connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CourseEnvironment", "root",
                    "riya");
            System.out.println("---CONNECTED SERVER SECESSFULLY---");
        } catch (Exception e) {
            System.out.println("---UNABLE TO CONNECT SQL SERVER---");
            System.out.println(e.getStackTrace());
            System.out.println(e);
        }
        System.out.println("Enter Your Name");
        String Name = sc.nextLine();
        System.out.println("Enter Your Roll_number :- ");
        int Roll_No = 0;
        try {
            Roll_No = sc.nextInt();
        } catch (Exception e) {
            System.out.println("ROLL NUMBER MUST BE INTEGER");
            working();
        }

        try {
            // step:3 create query
            
            String query = "SELECT * FROM student WHERE name = ? AND roll_no = ?";
            PreparedStatement pr1 = con.prepareStatement(query);
            pr1.setString(1, Name);
            pr1.setInt(2, Roll_No);

            ResultSet rs = pr1.executeQuery();

            if (rs.next()) {
                System.out.println("Login Successfully");
                System.out.println("Here are your details:");
                System.out.println("............................");

                // Step 4: Fetch data from database
                //System.out.println("Student_id : " + rs.getInt("Student_id"));
                System.out.println("Name : " + rs.getString("Name"));
                System.out.println("Roll_no : " + rs.getInt("Roll_no"));
                System.out.println("Password : " + rs.getString("Password"));
                System.out.println("Email ID : " + rs.getString("Email_id"));
                System.out.println("Course_name : " + rs.getString("Course_name"));
                System.out.println("Contact : " + rs.getLong("Contact"));
            } else {
                System.out.println("Login Failed: Invalid Name or Roll Number");
            }

        } catch (Exception e) {
            System.out.println("Error fetching data: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (Exception e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }

    }

}

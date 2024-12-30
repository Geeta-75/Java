import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Provider_Login {

    static Scanner sc = new Scanner(System.in);

    public static void p_login() {

        working();
    }

    public static void working() {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CourseEnvironment", "root",
                    "riya");
            System.out.println("---CONNECTED SERVER SECESSFULLY---");

        } catch (Exception e) {
            System.out.println("---UNABLE TO CONNECT SQL SERVER---");
            System.out.println(e.getStackTrace());
            System.out.println(e);
        }

        System.out.print("Enter Your id :- ");
        int Provider_id = sc.nextInt();
        System.out.print("Enter Your Name :- ");
        String Provider_name = sc.next();

        try {
            String query = "SELECT * FROM course_provider WHERE provider_id = ? AND provider_name = ?";
PreparedStatement Pr1 = con.prepareStatement(query);
Pr1.setInt(1, Provider_id);
Pr1.setString(2, Provider_name);
ResultSet RS = Pr1.executeQuery();
            if (RS.next()) {
            System.out.println("Login Successfully");
            System.out.println("Here is your details");
            System.out.println("............................");

                // student_id, name, roll_no, password, email_id, course_name, contact
                System.out.println("Provider_id : " + RS.getInt("Provider_id"));
                System.out.println("Provider_name : " + RS.getString("Provider_name"));
                System.out.println("Password : " + RS.getString("Password"));
                System.out.println("Email : " + RS.getString("Email"));
                System.out.println("Contact : " + RS.getString("Contact"));
                System.out.println("Course_name : " + RS.getString("Course_Name"));
            }
            else {
                System.out.println("Invalid ID or Name. Please try again.");
            }

            // Close the connection
            Pr1.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Data Not Found or Error Occurred");
            e.printStackTrace();
        }

    }

}
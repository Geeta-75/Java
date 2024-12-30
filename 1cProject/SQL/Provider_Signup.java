import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Provider_Signup {

    public static void p_signup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your ID");
        int id = sc.nextInt();
        System.out.println("Enter the Provider Name ");
        String Name = sc.next();
        System.out.println("Enter the Provider Password");
        String Password = sc.next();
        System.out.println("Enter Your Email_id");
        String Email = sc.next();
        System.out.println("Enter Your Contact");
        String Contact = sc.next();
        System.out.println("Enter the Course_Name");
        String Course_Name = sc.next();

        // Validate contact number
        if (!Pattern.matches("\\d{10}", Contact)) {
            System.out.println("Invalid contact number. It must be exactly 10 digits.");
            sc.close();
            return;
        }

        // Validate email
        if (!isValidEmail(Email)) {
            System.out.println("Invalid email address.");
            sc.close();
            return;
        }

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/CourseEnvironment";
        String user = "root";
        String password = "riya";

        // SQL query to insert data
        String query = "INSERT INTO course_provider (provider_id, provider_name, password, email, contact, course_name) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            // Step 1: Load and register driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established...");

            // Step 3: Create prepared statement
            PreparedStatement ps = con.prepareStatement(query);

            // Set parameter values
            ps.setInt(1, id);
            ps.setString(2, Name);
            ps.setString(3, Password);
            ps.setString(4, Email);
            ps.setString(5, Contact);
            ps.setString(6, Course_Name);

            // Step 4: Execute update
            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Data successfully inserted");
                Project p = new Project();
                p.main(null);
            } else {
                System.out.println("Data insertion failed");
            }

            // Step 5: Close the connection
            ps.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);
        return m.matches();
    }
}

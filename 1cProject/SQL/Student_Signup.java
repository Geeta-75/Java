import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Student_Signup {
    public static void Course() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Below are the courses that you can Enroll");
        System.out.println("1.ITEG");
        System.out.println("2.UI/UX");
        System.out.println("3.Digital Marketing");
        System.out.println("4.Python");
        System.out.println("Enter the corresponding number to view details of Courses");
        int in = sc.nextInt();

        switch (in) {
            case 1:
                System.out.println("Course Name: Information Technology & Course Duration: 12 months and certificates are available");
                break;
            case 2:
                System.out.println("Course Name: UI/UX & Course Duration: 6 months and certificates are available");
                break;
            case 3:
                System.out.println("Course Name: Digital Marketing & Course Duration: 4 months and certificates are available");
                break;
            case 4:
                System.out.println("Course Name: Python & Course Duration: 8 months and certificates are available");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
        option();
    }

    public static void option() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for Signup / Press 2 for Exit");
        int p = sc.nextInt();

        if (p == 1) {
            Register();
        } else {
            System.out.println("Thank you for your interest!");
            // Exit or do something else
        }
    }

    public static void Register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String Name = sc.next();
        System.out.println("Enter Your Roll_no");
        int Roll_no = sc.nextInt();
        System.out.println("Enter Your Password");
        String Password = sc.next();
        System.out.println("Enter Your Email_id");
        String Email_id = sc.next();

        // Validate the email
        if (!isValidEmail(Email_id)) {
            System.out.println("Invalid email format. Please try again.");
            return;  // Exit the method if email is not valid
        }

        System.out.println("Enter Your Course_Name");
        String Course_name = sc.next();

        long Contact = 0;
        boolean validContact = false;

        while (!validContact) {
            System.out.println("Enter Your Contact Number");
            try {
                Contact = sc.nextLong();
                validContact = true;  // Exit loop if valid contact is entered
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid contact number.");
                sc.next();  // Clear the invalid input
            }
        }

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/CourseEnvironment";
        String user = "root";
        String pass = "riya";

        // SQL query to insert data
        String query = "INSERT INTO student (Name, Roll_no, Password, email_id, Course_name, Contact) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            // Load and register driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection established...");

            // Create prepared statement
            PreparedStatement ps = con.prepareStatement(query);

            // Set parameter values
            ps.setString(1, Name);
            ps.setInt(2, Roll_no);
            ps.setString(3, Password);
            ps.setString(4, Email_id);
            ps.setString(5, Course_name);
            ps.setLong(6, Contact);

            // Execute update
            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Data successfully inserted");
            } else {
                System.out.println("Data insertion failed");
            }

            // Close the connection
            ps.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }

    // Email validation method
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/CourseEnvironment";
    private static final String USER = "root"; // MySQL username
    private static final String PASSWORD = "riya"; // MySQL password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


class CourseProvider {
    public void addCourse() {
   try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Course ProviderName ");
       String providerName = sc.nextLine();
       System.out.println("Course Name ");
       String courseName = sc.nextLine();
       System.out.println("Description");
       String description = sc.nextLine();
       System.out.println("Schedule");
       String schedule = sc.nextLine();
    
       String query = "INSERT INTO course (provider_name, course_name, description, schedule) VALUES (?, ?, ?, ?)";
    
            try (Connection con = DatabaseConnection.getConnection(); PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, providerName);
                pst.setString(2, courseName);
                pst.setString(3, description);
                pst.setString(4, schedule);
                pst.executeUpdate();
                System.out.println("Course added successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
}

    }
}

class Student {
    public void enrollCourse() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Student Name ");
               String studentName = sc.nextLine();
               System.out.println("Course ID ");
               int courseId = sc.nextInt();
               
               String query = "INSERT INTO enrollment (student_name, course_id) VALUES (?, ?)";

                    try (Connection con = DatabaseConnection.getConnection();  PreparedStatement pst = con.prepareStatement(query)) 
                        {
                        pst.setString(1, studentName);
                        pst.setInt(2, courseId);
                        pst.executeUpdate();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
        }
    }
}

class ProgressTracker {
    public void updateProgress(int enrollmentId, int progress) {
        // try (Scanner sc = new Scanner(System.in)) {
        //     System.out.println("EnrollmentID");
        //      enrollmentId = sc.nextInt();
        //      System.out.println("Progress");
        //      progress = sc.nextInt();
        // }
        try (Connection con = DatabaseConnection.getConnection()) {
            String query = "UPDATE enrollment SET progress = ?, certificate_issued = ? WHERE enrollment_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, progress);
            pst.setBoolean(2, progress == 100); // Jab progress 100% ho, certificate true ho jayega
            pst.setInt(3, enrollmentId);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


public class Task {
    public static void main(String[] args) {
        CourseProvider provider = new CourseProvider();
         provider.addCourse();

        Student student = new Student();
        student.enrollCourse(); 
        ProgressTracker tracker = new ProgressTracker();
        tracker.updateProgress(1, 50); // Progress ko 50% karega
        tracker.updateProgress(1, 100); // 100% complete karne par certificate issue karega
    }
}

// import java.util.Scanner;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;

// public class provider_signup 
// {
//     public static void p_signup()
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your id");
//         int id=sc.nextInt();
//         System.out.println("enter provider_name");
//         String name=sc.next();
//         System.out.println("enter provider_pass");
//         String pass=sc.next();
//         System.out.println("enter your email_id");
//         String email=sc.next();
//         System.out.println("enter your contact");
//         long contact=sc.nextLong();
//         System.out.println("enter your course_name");
//         String course_name=sc.next();

//         // Database connection details
//         String url = "jdbc:mysql://localhost:3306/project";
//         String user = "root";
//         String password = "1806";

//         // SQL query to insert data
//         String query = "INSERT INTO course_provider (provider_id, provider_name, pass,email, contact, course_name) VALUES (?, ?, ?, ?, ?, ?)";

//         try {
//             // Step 1: Load and register driver
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // Step 2: Create connection
//             Connection con = DriverManager.getConnection(url, user, password);
//             System.out.println("Connection established...");

//             // Step 3: Create prepared statement
//             PreparedStatement ps = con.prepareStatement(query);

//             // Set parameter values
//             ps.setInt(1,id);
//             ps.setString(2, name);
//             ps.setString(3,pass);
//             ps.setString(4, email);
//             ps.setLong(5, contact);
//             ps.setString(6, course_name);

//             // Step 4: Execute update
//             int i = ps.executeUpdate();

//             if (i > 0) {
//                 System.out.println("Data successfully inserted");
//                 project p=new project();
//                 p.main(null);
//             } else {
//                 System.out.println("Data insertion failed");
//             }

//             // Step 5: Close the connection
//             ps.close();
//             con.close();
//         } 
//         catch (ClassNotFoundException | SQLException e) 
//         {
//             e.printStackTrace();
//         }

//         sc.close();
//     }
// }
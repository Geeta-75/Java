import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/mydata";
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

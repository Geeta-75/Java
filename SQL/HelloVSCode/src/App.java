
import java.sql.*;

public class App {
    
    // static final String DB_URL = "jdbc:mysql://localhost:3306/mktest";
    // static final String User = "root";
    // static final String Pass = "";
    // static final String Query = "SELECT * FROM stud";

    public static void main(String args[]){  
        try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/company","root","riya");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select  Name from country where Population<10000;");  
        while(rs.next())  
        System.out.println(rs.getString(1));
         //System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
        con.close();  
        }catch(Exception e){ System.out.println(e);}  
    }
}

    

// Ek **Course Management System** banane ke liye jisme Java, MySQL, aur JDBC ka use hoga, aapko kuch basic steps follow karne honge. Main aapko step-by-step batata hoon kaise aap ye project bana sakte hain.

// ### Step 1: **Environment Setup**
// 1. **Install Java**: Ensure karein ke aapke system mein Java Development Kit (JDK) installed ho.
// 2. **Install MySQL**: MySQL database ko apne system mein install karein aur ek database banaayein.
// 3. **Set Up JDBC**: JDBC (Java Database Connectivity) driver ka jar file download karein aur apne project mein add karein.

// ### Step 2: **MySQL Database Setup**
// 1. **Database aur Tables Banaana**:
//    - Apne MySQL workbench ya command line client mein login karein.
//    - Ek naya database banayein aur tables create karein.

//    **SQL Commands**:
//    ```sql
//    -- Database create karna
//    CREATE DATABASE course_management;

//    -- Use karne ke liye
//    USE course_management;

//    -- Courses table banayein
//    CREATE TABLE courses (
//        course_id INT AUTO_INCREMENT PRIMARY KEY,
//        course_name VARCHAR(100) NOT NULL,
//        course_description TEXT
//    );

//    -- Students table banayein
//    CREATE TABLE students (
//        student_id INT AUTO_INCREMENT PRIMARY KEY,
//        student_name VARCHAR(100) NOT NULL,
//        course_id INT,
//        progress INT DEFAULT 0,
//        FOREIGN KEY (course_id) REFERENCES courses(course_id)
//    );
//    ```

// ### Step 3: **JDBC Connection Setup in Java**
// 1. **JDBC Driver Load Karna**:
//    - Apne Java program mein MySQL JDBC driver load karein.

//    **Example Code**:
//    ```java
//    import java.sql.Connection;
//    import java.sql.DriverManager;
//    import java.sql.SQLException;

//    public class DBConnection {
//        public static Connection getConnection() {
//            Connection connection = null;
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/course_management", 
//                    "username", "password"
//                );
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
//            return connection;
//        }
//    }
//    ```

//    **Note**: "username" aur "password" ko apne MySQL credentials se replace karein.

// ### Step 4: **Course Management Operations**
// 1. **Courses Add Karna**:
//    - Ek function banayein jo course details ko MySQL database mein insert karega.

//    **Example Code**:
//    ```java
//    import java.sql.Connection;
//    import java.sql.PreparedStatement;
//    import java.sql.SQLException;

//    public class CourseManager {
//        public static void addCourse(String courseName, String courseDescription) {
//            Connection conn = DBConnection.getConnection();
//            String sql = "INSERT INTO courses (course_name, course_description) VALUES (?, ?)";

//            try {
//                PreparedStatement stmt = conn.prepareStatement(sql);
//                stmt.setString(1, courseName);
//                stmt.setString(2, courseDescription);
//                stmt.executeUpdate();
//                System.out.println("Course added successfully.");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    ```

// 2. **Courses Display Karna**:
//    - Courses ko database se fetch karne ke liye ek function banayein.

//    **Example Code**:
//    ```java
//    import java.sql.Connection;
//    import java.sql.ResultSet;
//    import java.sql.Statement;

//    public class CourseManager {
//        public static void displayCourses() {
//            Connection conn = DBConnection.getConnection();
//            String sql = "SELECT * FROM courses";

//            try {
//                Statement stmt = conn.createStatement();
//                ResultSet rs = stmt.executeQuery(sql);

//                while (rs.next()) {
//                    System.out.println("Course ID: " + rs.getInt("course_id"));
//                    System.out.println("Course Name: " + rs.getString("course_name"));
//                    System.out.println("Course Description: " + rs.getString("course_description"));
//                    System.out.println("------------");
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    ```

// 3. **Student Registration Aur Progress Track Karna**:
//    - Students ko courses mein register karne aur progress track karne ke liye methods banayein.

//    **Example Code**:
//    ```java
//    import java.sql.Connection;
//    import java.sql.PreparedStatement;
//    import java.sql.ResultSet;
//    import java.sql.Statement;

//    public class StudentManager {
//        public static void registerStudent(String studentName, int courseId) {
//            Connection conn = DBConnection.getConnection();
//            String sql = "INSERT INTO students (student_name, course_id) VALUES (?, ?)";

//            try {
//                PreparedStatement stmt = conn.prepareStatement(sql);
//                stmt.setString(1, studentName);
//                stmt.setInt(2, courseId);
//                stmt.executeUpdate();
//                System.out.println("Student registered successfully.");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }

//        public static void updateProgress(int studentId, int progress) {
//            Connection conn = DBConnection.getConnection();
//            String sql = "UPDATE students SET progress = ? WHERE student_id = ?";

//            try {
//                PreparedStatement stmt = conn.prepareStatement(sql);
//                stmt.setInt(1, progress);
//                stmt.setInt(2, studentId);
//                stmt.executeUpdate();
//                System.out.println("Progress updated successfully.");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    ```

// ### Step 5: **Main Program Likho**
//    - **Kya Karen**: Ab ek `Main` class banayein jahan se user input le kar operations perform kar sakein.
//    - **Kaise Karen**:
//      - Menu-driven interface banayein jisme user courses add, display, students register, aur progress update kar sake.

//    **Example Code**:
//    ```java
//    import java.util.Scanner;

//    public class Main {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);

//            while (true) {
//                System.out.println("\n1. Add Course");
//                System.out.println("2. Display Courses");
//                System.out.println("3. Register Student");
//                System.out.println("4. Update Student Progress");
//                System.out.println("5. Exit");
//                System.out.print("Enter your choice: ");
//                int choice = scanner.nextInt();

//                switch (choice) {
//                    case 1:
//                        System.out.print("Enter course name: ");
//                        String courseName = scanner.next();
//                        System.out.print("Enter course description: ");
//                        String courseDescription = scanner.next();
//                        CourseManager.addCourse(courseName, courseDescription);
//                        break;

//                    case 2:
//                        CourseManager.displayCourses();
//                        break;

//                    case 3:
//                        System.out.print("Enter student name: ");
//                        String studentName = scanner.next();
//                        System.out.print("Enter course ID: ");
//                        int courseId = scanner.nextInt();
//                        StudentManager.registerStudent(studentName, courseId);
//                        break;

//                    case 4:
//                        System.out.print("Enter student ID: ");
//                        int studentId = scanner.nextInt();
//                        System.out.print("Enter progress (0-100): ");
//                        int progress = scanner.nextInt();
//                        StudentManager.updateProgress(studentId, progress);
//                        break;

//                    case 5:
//                        System.out.println("Exiting...");
//                        System.exit(0);

//                    default:
//                        System.out.println("Invalid choice!");
//                }
//            }
//        }
//    }
//    ```


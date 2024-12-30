package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Student {
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
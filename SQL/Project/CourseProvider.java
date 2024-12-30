package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CourseProvider {
    public void addCourse() {
   try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter the Course ProviderName ");
       String providerName = sc.nextLine();
       System.out.println("Enter the Course Name ");
       String courseName = sc.nextLine();
       System.out.println("Enter the Description");
       String description = sc.nextLine();
       System.out.println("Show Schedule");
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
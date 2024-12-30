package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProgressTracker {
    public void updateProgress(int enrollmentId, int progress) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("EnrollmentID");
             enrollmentId = sc.nextInt();
             System.out.println("Progress");
             progress = sc.nextInt();
        }
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
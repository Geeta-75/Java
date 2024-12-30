import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner; // Add this import for Scanner class

public class Remove {
    public static void StRemove() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the roll_no value to delete: ");
        String roll_no = sc.next();

        stRemove(roll_no);
    }

    public static void stRemove(String roll_no) {
        // Replace with your database connection details
        String url = "jdbc:mysql://localhost:3306/CourseEnvironment";
        String username = "root";
        String password = "riya";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            // Create a prepared statement to delete the row
            String query = "DELETE FROM student WHERE roll_no = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                // Set the value to match for the column
                pstmt.setString(1, roll_no);

                // Execute the query
                int rowsDeleted = pstmt.executeUpdate();

                System.out.println("Deleted " + rowsDeleted + " row(s)");
                System.out.println("Data deleted...");
            }
        } catch (SQLException e) {
            System.err.println("Error deleting row: " + e.getMessage());
            System.out.println(".....");
        }
    }
}

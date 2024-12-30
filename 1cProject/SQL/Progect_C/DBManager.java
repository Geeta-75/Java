package Progect_C;

import java.sql.*;

public class DBManager {
    private static final String URL = "jdbc:mysql://localhost:3306/YourDatabaseName";
    private static final String USER = "yourUsername";
    private static final String PASSWORD = "yourPassword";

    public DBManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public int addCourseProvider(String name, long contact, String password) throws SQLException {
        String query = "INSERT INTO course_providers (name, contact, password) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setLong(2, contact);
            stmt.setString(3, password);
            return stmt.executeUpdate();
        }
    }

    public CourseProvider getCProvider(long contact, String password) throws SQLException {
        String query = "SELECT * FROM course_providers WHERE contact = ? AND password = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setLong(1, contact);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new CourseProvider(rs.getInt("id"), rs.getString("name"), rs.getLong("contact"), rs.getString("password"));
                }
            }
        }
        return null;
    }

    // Add similar methods for student operations
}


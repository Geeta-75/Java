package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/CourseEnvironment";
        String user = "root"; 
        String password = "riya"; 
        return DriverManager.getConnection(url, user, password);
    }
}
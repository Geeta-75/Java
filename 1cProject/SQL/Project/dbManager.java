package Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class dbManager {
    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydata";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "riya";

    private Connection con;

    // Constructor: Initializes the database connection
    public dbManager(){
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection to the database
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error while connecting to database: " + e.getMessage());
        } catch (ClassNotFoundException e2) {
            System.out.println("Error while connecting to database: " + e2.getMessage());
        }
    }

    // Method to add a student to the database
    public int addStudent(int i, long l) throws SQLException{
        PreparedStatement pStatement = null;
        try {
            // Prepare SQL query to insert student data
            pStatement = con.prepareStatement("INSERT INTO student(studentName, stRoll, stCon, cProviderID) VALUES (?, ?, ?, ?)");
            pStatement.setString(1, i.getStudentName()); // Set student name
            pStatement.setInt(2, i.getStudentRoll()); // Set student roll number
            pStatement.setLong(3, i.getStudentCon()); // Set student contact number
            pStatement.setInt(4, l); // Set course provider ID
            // Execute the query and return the result
            return pStatement.executeUpdate();
        } finally {
            // Close the prepared statement
            if (pStatement != null) {
                pStatement.close();
            }
        }
    }

    // Method to remove a student from the database
    public int removeStudent(int stRoll, int cProviderID) throws SQLException {
        PreparedStatement pStatement = null;
        try {
            // Prepare SQL query to delete student data
            pStatement = con.prepareStatement("DELETE FROM student WHERE stRoll = ? AND cProviderID = ?");
            pStatement.setInt(1, stRoll); // Set student roll number
            pStatement.setInt(2, cProviderID); // Set course provider ID
            // Execute the query and return the result
            return pStatement.executeUpdate();
        } finally {
            // Close the prepared statement
            if (pStatement != null) {
                pStatement.close();
            }
        }
    }

    // Method to add a new course provider (signup)
    public int addCourseProvider(String name, long contact, String pass) throws SQLException {
        PreparedStatement pStatement = null;
        try {
            // Prepare SQL query to insert course provider data
            pStatement = con.prepareStatement("INSERT INTO cprovider(cProviderName, cProviderCon, cProviderPass) VALUES (?, ?, ?)");
            pStatement.setString(1, name); // Set provider name
            pStatement.setLong(2, contact); // Set provider contact number
        
            // Execute the query and return the result
            return pStatement.executeUpdate();
        } finally {
            // Close the prepared statement
            if (pStatement != null) {
                pStatement.close();
            }
        }
    }

    // Method to check course provider login details
    public static int checkCourseProvider(long contact, String pass) throws SQLException {
        PreparedStatement pStatement = null;
        ResultSet rSet = null;
        try {
            // Prepare SQL query to check provider details
            pStatement = con.prepareStatement("SELECT * FROM cprovider WHERE cProviderCon = ?");
            pStatement.setLong(1, contact); // Set provider contact number
            rSet = pStatement.executeQuery(); // Execute the query
            if (rSet.next()) {
                String encPass = rSet.getString("cProviderPass"); 
            } else {
                return 3; // Provider not found
            }
        } finally {
            // Close the prepared statement and result set
            if (pStatement != null) {
                pStatement.close();
            }
            if (rSet != null) {
                rSet.close();
            }
        }
        return 0;
    }

    // Method to fetch course provider details
    public CourseProvider getCProvider(long contact, String pass) throws SQLException {
        PreparedStatement pStatement = null;
        ResultSet rSet = null;
        try {
            // Prepare SQL query to fetch provider details
            pStatement = con.prepareStatement("SELECT * FROM cprovider WHERE cProviderCon = ?");
            pStatement.setLong(1, contact); // Set provider contact number
            rSet = pStatement.executeQuery(); // Execute the query
            if (rSet.next()) {
                String encPass = rSet.getString("cProviderPass"); 
            } else {
                return null; // Provider not found
            }
        } finally {
            // Close the prepared statement and result set
            if (pStatement != null) {
                pStatement.close();
            }
            if (rSet != null) {
                rSet.close();
            }
        }
        return null;
    }

    // Additional methods continue similarly for other functionalities like `getStudent`, `getCourses`, `getEnroll`, etc.
    // Each method performs specific SQL operations and handles database interactions.
    
   
}


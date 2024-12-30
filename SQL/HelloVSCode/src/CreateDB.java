import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;



public class CreateDB {
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/CourseEnvironment";
            String databaseName = "MyDatabase";
            String userName = "root";
            String password = "riya";

            Connection connection = DriverManager.getConnection(url, userName, password);
            String sql = "CREATE DATABASE" + databaseName;
            
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

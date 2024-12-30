
import java.sql.*;

public class createcon {

    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = ("jdbc:mysql://localhost:3306/?user=root");
            String USER = "root";
            String PASSWORD = "riya";
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);


            if(con.isClosed()) {
                System.out.println("Connection is closed");

            }
            else {
                 System.out.println("Connection is created");
            }
        }
            catch (Exception ClassNotFoundException) {
                System.out.println();
                
            }
        
    }
}

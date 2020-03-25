
package conexiones;

 
import java.sql.*;

public class conexion {
    
   public static Connection conectar() {
        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/";        
        String driver = "com.mysql.jdbc.Driver";

        String dbName = "panaderia", userName = "root", 
            password = "contra";      

        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName, userName, password);
            System.out.println("Connected to the database");
//            conn.close();
//            System.out.println("Disconnected from database");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
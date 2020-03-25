/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;
  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

class MysqlCon{  
    public static void main(String args[]){
        conexion con = new conexion();
        Connection conexion = con.conectar();
        String sql = "SELECT * FROM inventario";
        Statement st;
        try{
            st = conexion.createStatement();   
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()){
                System.out.println(result.getString(1));
                System.out.println(result.getString(2));
            }     
        } catch (SQLException ex) {
            System.out.println("No da ninguna consulta");
        }
        
         
    }
}
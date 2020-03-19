/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexionBD {
    private Connection conexion;
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //"jdbc:mysql://localhost:3306/tienda","root",""                  direccion daniel
            //"direccion fernando "      
            //conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:1234/panaderia","root","" );
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al canectarse");
            
        }
        return conexion;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erick
 */
public class Conexion {
 private static String URL = "jdbc:mysql://localhost/cafeteria";
 private static String Usuario = "root";
 private static String Contraseña = "inori";
 
 public static Connection conectar(){
     
     Connection conexion = null;
     
     try {
         Class.forName("com.mysql.jdbc.Driver");
         conexion = DriverManager.getConnection(URL, Usuario, Contraseña);
         System.out.println("Conexion establecida");
     } catch (ClassNotFoundException | SQLException e) {
         System.out.println("Error1: " +e);
     }
     
     
     return conexion;
     
 }
    
}

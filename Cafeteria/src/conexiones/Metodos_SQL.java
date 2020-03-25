/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Metodos_SQL {

    private static Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resultado;

    public void guardar_datos(int idCliente, String Nombre, String Direccion, String Telefono, int Nit ) {

        try {
            conexion = Conexion_BD.conectar();
            String consulta = "INSERT INTO cliente (idCliente,Nombre,Direccion,Telefono,Nit) VALUES (?,?,?,?,?)";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setInt(1, idCliente);
            sentencia_preparada.setString(2, Nombre);
           sentencia_preparada.setString(3, Direccion);
           sentencia_preparada.setString(4, Telefono);
            sentencia_preparada.setInt(5, Nit);
            int i = sentencia_preparada.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos Guardados");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }

            conexion.close();

        } catch (HeadlessException | SQLException e) {

            System.out.println("Error2: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error3: " + e);
            }
        }

    }
}

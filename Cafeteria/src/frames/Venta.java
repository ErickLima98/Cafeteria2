/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import Seguridad.Conexion;
import Seguridad.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USUARIO
 */
public class Venta extends javax.swing.JFrame {
    private static Usuario user;//variable global del usuario logeado
    /**
     * Creates new form Venta
     */
    public Venta() { 
        this.user=user;//Se asigna el usuaario que hizo login
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/cafe.png")).getImage());
        initComponents();      
        this.setLocationRelativeTo(null);
        LlenarcmbCliente();
        LlenarcmProducto();
        jTextFieldCantidad.setEnabled(false);
        jButtonAgregar.setVisible(false);
        jButtonEliminar.setVisible(false);
        jButtonTerminarVenta.setVisible(false);
        jButtonTerminarCompra.setVisible(false);
        
        jComboBoxProducto.setEnabled(false);
    }
    
    DefaultTableModel modelo=new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int fil, int col) {
                return col==8;
            }
        };
    Object[] ObjectTabla = new Object[99999];
    
 private  void mostrardatos(String valor)
 {
    try{
        Connection cn=Conexion.conectar();  
        DefaultTableModel modelo=new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int fil, int col) {
            return col==7;
            }
        };
        int UltimVe=obtenerUltimaVent();                
            jTable1.setModel(modelo);
            String sql="";
            if (valor.equals(""))
            {         
             sql=" select med.Nombre, ped.Cantidad_Medi, (ped.Cantidad_Medi * med.PrecioInt) as subtotal from pedido ped inner join lote lot on ped.Lote_idLotes = lot.idLotes inner join medicamento med on lot.Medicamento_idMedicamento = med.idMedicamento  where (ped.Venta_idVenta = '"+UltimVe+"' ) ";
            }
            String []datos=new String [6];
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                while(rs.next())
                {
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);                          
                    modelo.addRow(datos);
                }
                           
              
           
        }catch(SQLException ex){
           
          JOptionPane.showMessageDialog(null, "Error" +ex);
        }
    }
 
     
private int Validar()
    {
       
        if ( jtxtCantidad.getText().length()==0) 
        {
          JOptionPane.showMessageDialog(null, "Ingrese una cantidad", "Error", JOptionPane.ERROR_MESSAGE);
          return 1;
        }
        else if (radExt.isSelected()==false && radInter.isSelected()==false ) 
        {
          JOptionPane.showMessageDialog(null, "Seleccionar un precio", "Error", JOptionPane.ERROR_MESSAGE);
          return 1;

        }

        else
        {
            return 0;
        }
    }
    
   private void EliminarVenta( String idMedi, int Cant)
   {
   
        try {
            int idventa=obtenerUltimaVent();
            idMedi=idMedi.substring(0, 1);

            
            Connection cn=Conexion.conectar();
            String sql ="";
            sql = " select lot.idLotes,  ped.Cantidad_Medi, med.idMedicamento, ped.idPedido from pedido ped inner join lote lot on ped.Lote_idLotes =  lot.idLotes inner join medicamento med on lot.Medicamento_idMedicamento = med.idMedicamento where (ped.Cantidad_Medi ="+Cant+" and med.idMedicamento ="+idMedi+" and ped.Venta_idVenta ="+idventa+") ";
            String []datos=new String [6];
          
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                
                
                while(rs.next())
                {
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);                 
                    
                }
              
              PreparedStatement pst=cn.prepareStatement("UPDATE  Lote  set lote.Existencia = (Lote.Existencia + '"+datos[1]+"' ) where (lote.idLotes = '"+datos[0]+"' ) ");
              pst.executeUpdate();
              
              PreparedStatement pst2=cn.prepareStatement("UPDATE  Pedido  set Pedido.Cantidad_Medi = '0'  where (pedido.idPedido = '"+datos[3]+"' ) ");
              pst2.executeUpdate();
            
            
        } // Fin try
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null, "Error"+ex);
        } // Fin Catch   
   }

    private void LlenarcmbCliente()
    {
        
    }
    private void LlenarcmProducto()
    {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopOpciones = new javax.swing.JPopupMenu();
        jMenuEliminar = new javax.swing.JMenuItem();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonNuevaVenta = new javax.swing.JButton();
        jButtonTerminarCompra = new javax.swing.JButton();
        jButtonTerminarVenta = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jTextFieldCantMaxima = new javax.swing.JTextField();
        jLabelCantidadMaxima = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelCantidad = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        jLabelProducto = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jLabelCliente = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        jMenuEliminar.setText("jMenuItem1");
        jPopOpciones.add(jMenuEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venta");
        getContentPane().setLayout(null);
        getContentPane().add(jTextFieldTotal);
        jTextFieldTotal.setBounds(640, 310, 60, 20);

        jLabelTotal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.setText("Total :");
        getContentPane().add(jLabelTotal);
        jLabelTotal.setBounds(590, 310, 40, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 20, 480, 280);

        jButtonNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/NuevaCompraNegro.png"))); // NOI18N
        jButtonNuevaVenta.setBorderPainted(false);
        jButtonNuevaVenta.setContentAreaFilled(false);
        jButtonNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevaVenta);
        jButtonNuevaVenta.setBounds(140, 20, 50, 40);

        jButtonTerminarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/CancelarCarritoNegro.png"))); // NOI18N
        jButtonTerminarCompra.setBorderPainted(false);
        jButtonTerminarCompra.setContentAreaFilled(false);
        getContentPane().add(jButtonTerminarCompra);
        jButtonTerminarCompra.setBounds(110, 280, 65, 41);

        jButtonTerminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ComprarNegro.png"))); // NOI18N
        jButtonTerminarVenta.setBorderPainted(false);
        jButtonTerminarVenta.setContentAreaFilled(false);
        getContentPane().add(jButtonTerminarVenta);
        jButtonTerminarVenta.setBounds(10, 280, 65, 41);

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/error3.png"))); // NOI18N
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.setContentAreaFilled(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar);
        jButtonEliminar.setBounds(110, 230, 50, 40);

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/AñadirNegro.png"))); // NOI18N
        jButtonAgregar.setBorderPainted(false);
        jButtonAgregar.setContentAreaFilled(false);
        getContentPane().add(jButtonAgregar);
        jButtonAgregar.setBounds(20, 230, 50, 40);
        getContentPane().add(jTextFieldCantMaxima);
        jTextFieldCantMaxima.setBounds(90, 200, 100, 20);

        jLabelCantidadMaxima.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCantidadMaxima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantidadMaxima.setText("Cantidad Maxima");
        getContentPane().add(jLabelCantidadMaxima);
        jLabelCantidadMaxima.setBounds(90, 180, 98, 17);
        getContentPane().add(jTextFieldCantidad);
        jTextFieldCantidad.setBounds(20, 200, 50, 20);

        jLabelCantidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantidad.setText("Cantidad");
        getContentPane().add(jLabelCantidad);
        jLabelCantidad.setBounds(20, 180, 49, 17);

        jComboBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxProducto);
        jComboBoxProducto.setBounds(20, 150, 170, 20);

        jLabelProducto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProducto.setText("Producto :");
        getContentPane().add(jLabelProducto);
        jLabelProducto.setBounds(20, 130, 59, 17);

        getContentPane().add(jComboBoxCliente);
        jComboBoxCliente.setBounds(20, 100, 170, 20);

        jLabelCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCliente.setText("Cliente :");
        getContentPane().add(jLabelCliente);
        jLabelCliente.setBounds(20, 80, 45, 17);

        jButtonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Login2.png"))); // NOI18N
        jButtonMenu.setBorderPainted(false);
        jButtonMenu.setContentAreaFilled(false);
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu);
        jButtonMenu.setBounds(720, 300, 40, 40);

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/FondoAzul.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 770, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
        menu otro = new menu();
        this.setVisible(false);
        otro.setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaVentaActionPerformed
        jTable1.setEnabled(true);
        
    }//GEN-LAST:event_jButtonNuevaVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonNuevaVenta;
    private javax.swing.JButton jButtonTerminarCompra;
    private javax.swing.JButton jButtonTerminarVenta;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxProducto;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCantidadMaxima;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JMenuItem jMenuEliminar;
    private javax.swing.JPopupMenu jPopOpciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCantMaxima;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}

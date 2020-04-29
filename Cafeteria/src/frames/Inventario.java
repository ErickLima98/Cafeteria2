/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

<<<<<<< HEAD
import Seguridad.Metodos_SQL;
=======
>>>>>>> erick/CambioInterfaz
import Seguridad.Usuario;
import Seguridad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
<<<<<<< HEAD
=======
import javax.swing.ImageIcon;
>>>>>>> erick/CambioInterfaz
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author donald
 */

public class Inventario extends javax.swing.JFrame {
<<<<<<< HEAD
    Metodos_SQL metodos_SQL = new Metodos_SQL();
    
        public Inventario() {
        initComponents();
    }

    
    
    
  //  private static Usuario user;//variable global del usuario logead
    /**
     * Creates new form Inventario
     */
//    public Inventario(Usuario user) {
//        this.user = user;
//        this.setLocation(null);
//        initComponents();
//        this.setLocale(null);
//    }
//
//    Inventario() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    private int Validad(){
        if(nombreproducto.getText().length()==0)
=======
    private static Usuario user;//variable global del usuario logead
    /**
     * Creates new form Inventario
     */
    public Inventario(Usuario user) {
        this.user = user;
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/cafe.png")).getImage());
        initComponents();
        this.setLocationRelativeTo(null);
        mostrardatos("");
        jButtonNuevo.setVisible(true);
        jButtonCancelar.setVisible(false);
       
        jTextFieldNombre.setEnabled(false);
        jTextFieldCantidad.setEnabled(false);
        jTextFieldPrecio.setEnabled(false);
        jButtonInsertar.setEnabled(false);
        jButtonInsertar.setVisible(false);
        jButtonModificar.setVisible(false);
    }
    
    private int Validad(){
        if(jTextFieldNombre.getText().length()==0)
>>>>>>> erick/CambioInterfaz
        {
            JOptionPane.showMessageDialog(null,"Llenar Todos Los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return 1;
        }
<<<<<<< HEAD
        else if(cantidadproducto.getText().length()==0)
=======
        else if(jTextFieldCantidad.getText().length()==0)
>>>>>>> erick/CambioInterfaz
        {
            JOptionPane.showMessageDialog(null,"Llenar Todos Los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return 1;
        }
<<<<<<< HEAD
        else if(precioproducto.getText().length()==0)
=======
        else if(jTextFieldPrecio.getText().length()==0)
>>>>>>> erick/CambioInterfaz
        {
            JOptionPane.showMessageDialog(null,"Llenar Todos Los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    private void mostrardatos(String valor){
        try {
            Connection cn = Conexion.conectar();
<<<<<<< HEAD
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String sql="";
            Object[]tabla = new Object[4];
            Statement st = cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while (rs.next())
            {
               tabla[0]=rs.getString(1);
               tabla[1]=rs.getString(2);
               tabla[2]=rs.getString(3);
               tabla[3]=rs.getString(4);
               model.addRow(tabla);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR" +ex);
=======
            DefaultTableModel modelo=new DefaultTableModel()
            {
                @Override
               public boolean isCellEditable(int fila, int col){
                  return col==5;
               }
            };
            modelo.addColumn("ID Inventario");
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio Q.");
            
            jTable1.setModel(modelo);
            String sql="";
            if (valor.equals(""))
            {
                sql="SELECT * FROM inventario";
            }
            String []datos=new String [5];
            
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                while(rs.next())
                {
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);                    
                    modelo.addRow(datos);
                }  
        }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "Error" +ex);
>>>>>>> erick/CambioInterfaz
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        precioproducto = new javax.swing.JTextField();
=======
        jPopOpciones = new javax.swing.JPopupMenu();
        jMenuInsertar = new javax.swing.JMenuItem();
        jMenuEditarPrecio = new javax.swing.JMenuItem();
        jTextFieldPrecio = new javax.swing.JTextField();
>>>>>>> erick/CambioInterfaz
        jLabelPrecio = new javax.swing.JLabel();
        cantidadproducto = new javax.swing.JTextField();
        jLabelCantidad = new javax.swing.JLabel();
        nombreproducto = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonInsertar = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelFondo = new javax.swing.JLabel();

        jMenuInsertar.setText("jMenuItem1");
        jMenuInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInsertarActionPerformed(evt);
            }
        });
        jPopOpciones.add(jMenuInsertar);

        jMenuEditarPrecio.setText("jMenuItem1");
        jMenuEditarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditarPrecioActionPerformed(evt);
            }
        });
        jPopOpciones.add(jMenuEditarPrecio);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
<<<<<<< HEAD
        getContentPane().add(precioproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 110, -1));
=======
        getContentPane().add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 160, -1));
>>>>>>> erick/CambioInterfaz

        jLabelPrecio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecio.setText("Precio :");
<<<<<<< HEAD
        getContentPane().add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 80, -1));
        getContentPane().add(cantidadproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 110, -1));
=======
        getContentPane().add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 80, -1));
        getContentPane().add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 160, -1));
>>>>>>> erick/CambioInterfaz

        jLabelCantidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantidad.setText("Cantidad :");
<<<<<<< HEAD
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 90, -1));
        getContentPane().add(nombreproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 110, -1));
=======
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 90, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 160, -1));
>>>>>>> erick/CambioInterfaz

        jLabelNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre :");
<<<<<<< HEAD
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 90, -1));
=======
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 90, -1));
>>>>>>> erick/CambioInterfaz

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/error3.png"))); // NOI18N
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(58, 34));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 40, 40));

        jButtonInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/check2.png"))); // NOI18N
        jButtonInsertar.setBorderPainted(false);
        jButtonInsertar.setContentAreaFilled(false);
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(jButtonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 40, 40));
=======
        getContentPane().add(jButtonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 40, 40));
>>>>>>> erick/CambioInterfaz

        jButtonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Login2.png"))); // NOI18N
        jButtonMenu.setBorderPainted(false);
        jButtonMenu.setContentAreaFilled(false);
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 40, 40));

        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/AñadirNegro.png"))); // NOI18N
        jButtonNuevo.setBorderPainted(false);
        jButtonNuevo.setContentAreaFilled(false);
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 40, 40));

        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Lapiz.png"))); // NOI18N
        jButtonModificar.setBorderPainted(false);
        jButtonModificar.setContentAreaFilled(false);
        jButtonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 30, 40));

        jButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/refrescar.png"))); // NOI18N
        jButtonMostrar.setBorderPainted(false);
        jButtonMostrar.setContentAreaFilled(false);
        jButtonMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMostrar.setOpaque(false);
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 40, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 550, 210));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/FondoAzul.jpg"))); // NOI18N
<<<<<<< HEAD
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 300));
=======
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 300));
>>>>>>> erick/CambioInterfaz

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
<<<<<<< HEAD
       Metodos_SQL s = new Metodos_SQL();
       int id = s.iddd();
       metodos_SQL.guardar_datos(id, nombreproducto.getText(), Integer.parseInt(cantidadproducto.getText()), Float.parseFloat(precioproducto.getText()));
     
=======
        try {
            Connection cn = Conexion.conectar();
            {
                if(Validad()==0)
                {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO inventario(Nombre,Existencias,Precio_venta)VALUES(?,?,?)");
                    pst.setString(1,jTextFieldNombre.getText());
                    pst.setString(2,jTextFieldCantidad.getText());
                    pst.setDouble(3,Double.parseDouble(jTextFieldPrecio.getText()));
                    //pst.setBoolean(4,true);
                    int a = pst.executeUpdate();
                    if(a>0)
                    {
                        JOptionPane.showMessageDialog(null,"Registro Exitoso");
                        mostrardatos("");
                        jTextFieldNombre.setText(null);
                        jTextFieldCantidad.setText(null);
                        jTextFieldPrecio.setText(null);
                        jButtonCancelar.setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Error al agregar");
                    }
                }//Fin del if
                else
                {
                    JOptionPane.showMessageDialog(null,"Llenar Todos Los Campos","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }//Fin Conexion
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
>>>>>>> erick/CambioInterfaz
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jButtonNuevo.setVisible(true);
        jButtonCancelar.setVisible(false);
        jButtonInsertar.setVisible(false);
        jTextFieldNombre.setEnabled(false);
        jTextFieldCantidad.setEnabled(false);
        jTextFieldPrecio.setEnabled(false);
        
        jTextFieldNombre.setText("");
        jTextFieldCantidad.setText("");
        jTextFieldPrecio.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

  
    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        menu otro = new menu();
        this.setVisible(false);
        otro.setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        jButtonNuevo.setVisible(false);
        jButtonCancelar.setVisible(true);
        jButtonInsertar.setVisible(true);
        jButtonInsertar.setEnabled(true);
        jTextFieldNombre.setEnabled(true);
        jTextFieldCantidad.setEnabled(true);
        jTextFieldPrecio.setEnabled(true);
        
        jTextFieldNombre.setText("");
        jTextFieldCantidad.setText("");
        jTextFieldPrecio.setText("");
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jMenuInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInsertarActionPerformed
        jButtonCancelar.setVisible(true);
        jButtonNuevo.setVisible(true);
        jButtonInsertar.setVisible(true);
        jButtonInsertar.setEnabled(true);
        jTextFieldNombre.setEnabled(true);
        jTextFieldCantidad.setEnabled(true);
        jTextFieldPrecio.setEnabled(true);
        
        jTextFieldNombre.setText("");
        jTextFieldCantidad.setText("");
        jTextFieldPrecio.setText("");
    }//GEN-LAST:event_jMenuInsertarActionPerformed

    private void jMenuEditarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditarPrecioActionPerformed
        jButtonInsertar.setVisible(false);
        jButtonNuevo.setVisible(false);
        jButtonCancelar.setVisible(true);
        
        int fila = jTable1.getSelectedRow();
        if (fila == 1)
        {
            JOptionPane.showMessageDialog(null,"Seleccionar una casilla","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            jTextFieldPrecio.setEnabled(true);
            jButtonModificar.setVisible(true);
            
            jTextFieldNombre.setText(jTable1.getValueAt(fila,1).toString());
            jTextFieldCantidad.setText(jTable1.getValueAt(fila, 2).toString());
            jTextFieldPrecio.setText(jTable1.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_jMenuEditarPrecioActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        try {
            Connection cn = Conexion.conectar();
            int fila =jTable1.getSelectedRow();
            String idm="";
            if(fila==-1)
            {
                JOptionPane.showMessageDialog(null,"Seleccione una casilla","ERROR",JOptionPane.ERROR_MESSAGE);    
            }
            else
            {
                idm=jTable1.getValueAt(fila,0).toString();
            }
            try {
                if(Validad()==0)
                {
                    PreparedStatement pst = cn.prepareStatement("UPDATE inventario SET idInventario ='"+idm+"',Nombre='"+jTextFieldNombre.getText()+"',Existencias='"+jTextFieldCantidad.getText()+"',Precio_venta='"+jTextFieldPrecio.getText());
                    pst.executeUpdate();
                    mostrardatos("");
                    jTextFieldNombre.setText(null);
                    jTextFieldCantidad.setText(null);
                    jTextFieldPrecio.setText(null);
                    jButtonModificar.setVisible(false);
                    JOptionPane.showMessageDialog(null,"Registro Modificado con Exito");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Llenar todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"ERROR" +e);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR" +ex);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        mostrardatos("");
        
        jButtonNuevo.setVisible(true);
        //radHabili.setSelected(true);
        jButtonInsertar.setVisible(false);     
        jButtonModificar.setVisible(false);
        jTextFieldNombre.setText("");
        jTextFieldPrecio.setText("");
    }//GEN-LAST:event_jButtonMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
<<<<<<< HEAD
               new Inventario().setVisible(true);
=======
                new Inventario(user).setVisible(true);
>>>>>>> erick/CambioInterfaz
            }
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JTextField cantidadproducto;
=======
>>>>>>> erick/CambioInterfaz
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JMenuItem jMenuEditarPrecio;
    private javax.swing.JMenuItem jMenuInsertar;
    private javax.swing.JPopupMenu jPopOpciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreproducto;
    private javax.swing.JTextField precioproducto;
    // End of variables declaration//GEN-END:variables
}

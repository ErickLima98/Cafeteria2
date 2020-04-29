/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.ImageIcon;
import Seguridad.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author donald
 */
public class menu extends javax.swing.JFrame {
private static Usuario user;//variable global del usuario logeado
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/cafe.png")).getImage());
    }
    
    public menu(Usuario user) {//metodo constructor que recibe el usuario logeados
        initComponents();
        this.user=user;//Se asigna el usuaario que hizo login
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/cafe.png")).getImage());
        
    }

    
     public void seguridad(){
        System.out.println("nivel de acceso: "+user.getNivelAcceso());
        if(user.getNivelAcceso()==1){
            jButtonAnadirUsuario.setVisible(true);
            jButtonCliente.setVisible(true);
            jButtonInventario.setVisible(true);
            jButtonUsuarios.setVisible(true);
            jButtonVenta.setVisible(true);
        }else if(user.getNivelAcceso()==2){
            jButtonAnadirUsuario.setVisible(true);
            jButtonCliente.setVisible(true);
            jButtonInventario.setVisible(true);
            jButtonUsuarios.setVisible(true);
            jButtonVenta.setVisible(true);       
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

        jButtonUsuarios = new javax.swing.JButton();
        jButtonAnadirUsuario = new javax.swing.JButton();
        jButtonVenta = new javax.swing.JButton();
        jButtonInventario = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonCompras = new javax.swing.JButton();
        jButtonCierre = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonProveedores = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Grupo-de-Usuarios.png"))); // NOI18N
        jButtonUsuarios.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>USUARIOS</h4>\n\t</div>\n</body>\n</html>");
        jButtonUsuarios.setBorderPainted(false);
        jButtonUsuarios.setContentAreaFilled(false);
        jButtonUsuarios.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 110, 100));

        jButtonAnadirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Agregar-Usuario.png"))); // NOI18N
        jButtonAnadirUsuario.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>AÑADIR USUARIO</h4>\n\t</div>\n</body>\n</html>");
        jButtonAnadirUsuario.setBorderPainted(false);
        jButtonAnadirUsuario.setContentAreaFilled(false);
        jButtonAnadirUsuario.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonAnadirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAnadirUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 120, 100));

        jButtonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ventas.png"))); // NOI18N
        jButtonVenta.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>VENTAS</h4>\n\t</div>\n</body>\n</html>");
        jButtonVenta.setBorderPainted(false);
        jButtonVenta.setContentAreaFilled(false);
        jButtonVenta.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 110, 100));

        jButtonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Inventario.png"))); // NOI18N
        jButtonInventario.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>INVENTARIO</h4>\n\t</div>\n</body>\n</html>");
        jButtonInventario.setBorderPainted(false);
        jButtonInventario.setContentAreaFilled(false);
        jButtonInventario.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 110, 100));

        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Clientes.png"))); // NOI18N
        jButtonCliente.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>CLIENTES</h4>\n\t</div>\n</body>\n</html>");
        jButtonCliente.setBorderPainted(false);
        jButtonCliente.setContentAreaFilled(false);
        jButtonCliente.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, 100));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Login.png"))); // NOI18N
        btnCerrar.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>CERRAR SESION</h4>\n\t</div>\n</body>\n</html>");
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 110, 100));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CERRAR SESIÓN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cafe.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 160, 90));

        jButtonCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ventas.png"))); // NOI18N
        jButtonCompras.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>COMPRAS</h4>\n\t</div>\n</body>\n</html>");
        jButtonCompras.setBorderPainted(false);
        jButtonCompras.setContentAreaFilled(false);
        jButtonCompras.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 110, 100));

        jButtonCierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Clientes.png"))); // NOI18N
        jButtonCierre.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>CIERRE</h4>\n\t</div>\n</body>\n</html>");
        jButtonCierre.setBorderPainted(false);
        jButtonCierre.setContentAreaFilled(false);
        jButtonCierre.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCierreActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 110, 100));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("INVENTARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("VENTAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("CIERRE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("CLIENTES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("COMPRAS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        jButtonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ventas.png"))); // NOI18N
        jButtonProveedores.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>PROVEEDORES</h4>\n\t</div>\n</body>\n</html>");
        jButtonProveedores.setBorderPainted(false);
        jButtonProveedores.setContentAreaFilled(false);
        jButtonProveedores.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, 100));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("PROVEEDORES");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("AÑADIR USUARIO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("USUARIOS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventarioActionPerformed
        Inventario in = new Inventario(user);
        this.setVisible(false);
        in.setVisible(true);
    }//GEN-LAST:event_jButtonInventarioActionPerformed

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        Cliente cliente = new Cliente(user);
        this.setVisible(false);
        cliente.setVisible(true);
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonAnadirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirUsuarioActionPerformed
        AnadirUsuario usuar = new AnadirUsuario();
        this.setVisible(false);
        usuar.setVisible(true);
    }//GEN-LAST:event_jButtonAnadirUsuarioActionPerformed

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed
        Usuarios usuar = new Usuarios();
        this.setVisible(false);
        usuar.setVisible(true);
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentaActionPerformed
        Venta venta = new Venta();
        this.setVisible(false);
        venta.setVisible(true);
    }//GEN-LAST:event_jButtonVentaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        Inicio otro = new Inicio();
        otro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jButtonComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonComprasActionPerformed

    private void jButtonCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCierreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCierreActionPerformed

    private void jButtonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton jButtonAnadirUsuario;
    private javax.swing.JButton jButtonCierre;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonCompras;
    private javax.swing.JButton jButtonInventario;
    private javax.swing.JButton jButtonProveedores;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JButton jButtonVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables

}

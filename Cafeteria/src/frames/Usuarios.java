/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author USUARIO
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jPasswordFieldContrase = new javax.swing.JPasswordField();
        jLabelContrase = new javax.swing.JLabel();
        jTextFieldAcceso = new javax.swing.JTextField();
        jLabelAcceso = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/search_1.png"))); // NOI18N
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setContentAreaFilled(false);
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 40, 30));
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, -1));

        jPasswordFieldContrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContraseActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldContrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 130, -1));

        jLabelContrase.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelContrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContrase.setText("Constraseña :");
        getContentPane().add(jLabelContrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 100, -1));
        getContentPane().add(jTextFieldAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 130, -1));

        jLabelAcceso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAcceso.setText("Acceso :");
        getContentPane().add(jLabelAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 130, -1));

        jLabelNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre :");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, -1));

        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 130, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 50, -1));

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Save.png"))); // NOI18N
        jButtonGuardar.setBorderPainted(false);
        jButtonGuardar.setContentAreaFilled(false);
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 30, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Acceso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 530, 250));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informacion Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, -1));

        jButtonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Login2.png"))); // NOI18N
        jButtonMenu.setBorderPainted(false);
        jButtonMenu.setContentAreaFilled(false);
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 40, 40));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/FondoAzul.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jPasswordFieldContraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldContraseActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
        menu otro = new menu();
        this.setVisible(false);
        otro.setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAcceso;
    private javax.swing.JLabel jLabelContrase;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPasswordField jPasswordFieldContrase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAcceso;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextField_ID;
    // End of variables declaration//GEN-END:variables
}

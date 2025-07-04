package com.mycompany.fixya;

import javax.swing.*;

public class InicioSesionFrame extends JFrame {
    private Autenticacion auth;
    /**
     * Creates new form InicioSesion
     */
    public InicioSesionFrame() {
        auth = new Autenticacion();
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

        background = new javax.swing.JPanel();
        CrearCuenta = new javax.swing.JPanel();
        CrearCuentaBtn = new javax.swing.JButton();
        IniciarSesion = new javax.swing.JPanel();
        IniciarSesionBtn = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JPanel();
        NombreUsuarioField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Contrasena = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ContrasenaPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(0, 102, 204));
        background.setPreferredSize(new java.awt.Dimension(700, 400));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CrearCuenta.setBackground(new java.awt.Color(0, 153, 153));

        CrearCuentaBtn.setBackground(new java.awt.Color(0, 51, 51));
        CrearCuentaBtn.setForeground(new java.awt.Color(255, 255, 255));
        CrearCuentaBtn.setText("Crear cuenta");
        CrearCuentaBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CrearCuentaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CrearCuentaBtnMousePressed(evt);
            }
        });
        CrearCuentaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearCuentaLayout = new javax.swing.GroupLayout(CrearCuenta);
        CrearCuenta.setLayout(CrearCuentaLayout);
        CrearCuentaLayout.setHorizontalGroup(
            CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CrearCuentaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        CrearCuentaLayout.setVerticalGroup(
            CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CrearCuentaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(CrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 160, 30));

        IniciarSesion.setBackground(new java.awt.Color(0, 153, 153));

        IniciarSesionBtn.setBackground(new java.awt.Color(0, 51, 51));
        IniciarSesionBtn.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesionBtn.setText("Iniciar sesión");
        IniciarSesionBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IniciarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IniciarSesionLayout = new javax.swing.GroupLayout(IniciarSesion);
        IniciarSesion.setLayout(IniciarSesionLayout);
        IniciarSesionLayout.setHorizontalGroup(
            IniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IniciarSesionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        IniciarSesionLayout.setVerticalGroup(
            IniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IniciarSesionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 160, 30));

        Header.setBackground(new java.awt.Color(0, 102, 204));

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FixYa-Taller Vehicular");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        NombreUsuario.setBackground(new java.awt.Color(153, 204, 255));
        NombreUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NombreUsuarioField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreUsuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsuarioFieldActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 51, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre de usuario");

        javax.swing.GroupLayout NombreUsuarioLayout = new javax.swing.GroupLayout(NombreUsuario);
        NombreUsuario.setLayout(NombreUsuarioLayout);
        NombreUsuarioLayout.setHorizontalGroup(
            NombreUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NombreUsuarioField)
            .addGroup(NombreUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NombreUsuarioLayout.setVerticalGroup(
            NombreUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NombreUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NombreUsuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 160, 90));

        Contrasena.setBackground(new java.awt.Color(153, 204, 255));
        Contrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña");

        ContrasenaPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ContrasenaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaPasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContrasenaLayout = new javax.swing.GroupLayout(Contrasena);
        Contrasena.setLayout(ContrasenaLayout);
        ContrasenaLayout.setHorizontalGroup(
            ContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(ContrasenaPasswordField)
        );
        ContrasenaLayout.setVerticalGroup(
            ContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContrasenaLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContrasenaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        background.add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 160, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionBtnActionPerformed
        // TODO add your handling code here:
        realizarLogin();
    }//GEN-LAST:event_IniciarSesionBtnActionPerformed

    private void CrearCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearCuentaBtnActionPerformed

    private void CrearCuentaBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCuentaBtnMousePressed
        // TODO add your handling code here:
        new CrearCuentaFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_CrearCuentaBtnMousePressed

    private void ContrasenaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaPasswordFieldActionPerformed

    private void NombreUsuarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioFieldActionPerformed
    private void realizarLogin() {
        String usuario = NombreUsuarioField.getText();
        String contrasena = new String(ContrasenaPasswordField.getPassword());

        Usuario u = auth.iniciarSesion(usuario, contrasena);
        if (u != null) {
            JOptionPane.showMessageDialog(this, "Bienvenido " + u.getNombre());
            new MenuPrincipalFrame().setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
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
            java.util.logging.Logger.getLogger(InicioSesionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contrasena;
    private javax.swing.JPasswordField ContrasenaPasswordField;
    private javax.swing.JPanel CrearCuenta;
    private javax.swing.JButton CrearCuentaBtn;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel IniciarSesion;
    private javax.swing.JButton IniciarSesionBtn;
    private javax.swing.JPanel NombreUsuario;
    private javax.swing.JTextField NombreUsuarioField;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

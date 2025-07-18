
package com.mycompany.fixya;

import javax.swing.JFrame;

/**
 *
 * @author Tote
 */
public class MenuOrdenesFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuOrdenesFrame
     */
    public MenuOrdenesFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        crearOrdenBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        agregarTrabajoBtn = new javax.swing.JButton();
        buscarOrdenBtn = new javax.swing.JButton();
        verTrabajosPorOrdenBtn = new javax.swing.JButton();
        cambiarEstadoOrdenBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearOrdenBtn.setBackground(new java.awt.Color(51, 102, 255));
        crearOrdenBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        crearOrdenBtn.setForeground(new java.awt.Color(255, 255, 255));
        crearOrdenBtn.setText("Crear Orden");
        crearOrdenBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearOrdenBtn.setBorderPainted(false);
        crearOrdenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearOrdenBtnActionPerformed(evt);
            }
        });
        jPanel1.add(crearOrdenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 220, 60));

        volverBtn.setBackground(new java.awt.Color(102, 102, 102));
        volverBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volverBtn.setForeground(new java.awt.Color(255, 255, 255));
        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        jPanel1.add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        agregarTrabajoBtn.setBackground(new java.awt.Color(51, 102, 255));
        agregarTrabajoBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        agregarTrabajoBtn.setForeground(new java.awt.Color(255, 255, 255));
        agregarTrabajoBtn.setText("Agregar Trabajo ");
        agregarTrabajoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agregarTrabajoBtn.setBorderPainted(false);
        agregarTrabajoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTrabajoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(agregarTrabajoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 220, 60));

        buscarOrdenBtn.setBackground(new java.awt.Color(51, 102, 255));
        buscarOrdenBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        buscarOrdenBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarOrdenBtn.setText("Buscar Orden");
        buscarOrdenBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarOrdenBtn.setBorderPainted(false);
        buscarOrdenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarOrdenBtnActionPerformed(evt);
            }
        });
        jPanel1.add(buscarOrdenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 220, 60));

        verTrabajosPorOrdenBtn.setBackground(new java.awt.Color(51, 102, 255));
        verTrabajosPorOrdenBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        verTrabajosPorOrdenBtn.setForeground(new java.awt.Color(255, 255, 255));
        verTrabajosPorOrdenBtn.setText("Ver trabajos por orden");
        verTrabajosPorOrdenBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verTrabajosPorOrdenBtn.setBorderPainted(false);
        verTrabajosPorOrdenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTrabajosPorOrdenBtnActionPerformed(evt);
            }
        });
        jPanel1.add(verTrabajosPorOrdenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 220, 60));

        cambiarEstadoOrdenBtn.setBackground(new java.awt.Color(51, 102, 255));
        cambiarEstadoOrdenBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cambiarEstadoOrdenBtn.setForeground(new java.awt.Color(255, 255, 255));
        cambiarEstadoOrdenBtn.setText("Cambiar Estado Orden");
        cambiarEstadoOrdenBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cambiarEstadoOrdenBtn.setBorderPainted(false);
        cambiarEstadoOrdenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarEstadoOrdenBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cambiarEstadoOrdenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 220, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu Orden.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        // TODO add your handling code here:
        new MenuPrincipalFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void crearOrdenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearOrdenBtnActionPerformed
        // TODO add your handling code here:
        new CrearOrdenFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_crearOrdenBtnActionPerformed

    private void agregarTrabajoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTrabajoBtnActionPerformed
        // TODO add your handling code here:
        new AgregarTrabajoOrdenFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_agregarTrabajoBtnActionPerformed

    private void buscarOrdenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarOrdenBtnActionPerformed
        // TODO add your handling code here:
        new BuscarOrdenFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buscarOrdenBtnActionPerformed

    private void verTrabajosPorOrdenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTrabajosPorOrdenBtnActionPerformed
        // TODO add your handling code here:
        new VerTrabajosPorOrdenFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_verTrabajosPorOrdenBtnActionPerformed

    private void cambiarEstadoOrdenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarEstadoOrdenBtnActionPerformed
        // TODO add your handling code here:
        new CambiarEstadoOrdenFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cambiarEstadoOrdenBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MenuOrdenesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOrdenesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOrdenesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOrdenesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOrdenesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarTrabajoBtn;
    private javax.swing.JButton buscarOrdenBtn;
    private javax.swing.JButton cambiarEstadoOrdenBtn;
    private javax.swing.JButton crearOrdenBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton verTrabajosPorOrdenBtn;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}

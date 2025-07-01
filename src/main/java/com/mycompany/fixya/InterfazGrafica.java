package com.mycompany.fixya;

public class InterfazGrafica {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}

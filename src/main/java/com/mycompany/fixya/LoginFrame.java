package com.mycompany.fixya;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JTextField usuarioField;
    private JPasswordField contrasenaField;
    private Autenticacion auth;

    public LoginFrame() {
        auth = new Autenticacion();
        initUI();
    }

    private void initUI() {
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        usuarioField = new JTextField(15);
        contrasenaField = new JPasswordField(15);
        JButton ingresarBtn = new JButton("Ingresar");
        JButton registrarBtn = new JButton("Registrarse");

        ingresarBtn.addActionListener(e -> realizarLogin());
        registrarBtn.addActionListener(e -> {
            new RegistroFrame(this).setVisible(true);
            setVisible(false);
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 5, 5));
        panel.add(new JLabel("Usuario:"));
        panel.add(usuarioField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(contrasenaField);
        panel.add(ingresarBtn);
        panel.add(registrarBtn);

        add(panel);
        pack();
    }

    private void realizarLogin() {
        String usuario = usuarioField.getText();
        String contrasena = new String(contrasenaField.getPassword());

        Usuario u = auth.iniciarSesion(usuario, contrasena);
        if (u != null) {
            JOptionPane.showMessageDialog(this, "Bienvenido " + u.getNombre());
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}

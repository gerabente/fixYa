package com.mycompany.fixya;

import javax.swing.*;
import java.awt.*;

public class RegistroFrame extends JFrame {
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField correoField;
    private JTextField telefonoField;
    private JTextField usuarioField;
    private JPasswordField contrasenaField;
    private Autenticacion auth;
    private JFrame loginFrame;

    public RegistroFrame(JFrame loginFrame) {
        this.loginFrame = loginFrame;
        auth = new Autenticacion();
        initUI();
    }

    private void initUI() {
        setTitle("Registro de Usuario");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        nombreField = new JTextField(15);
        apellidoField = new JTextField(15);
        correoField = new JTextField(15);
        telefonoField = new JTextField(15);
        usuarioField = new JTextField(15);
        contrasenaField = new JPasswordField(15);

        JButton registrarBtn = new JButton("Registrar");
        JButton cancelarBtn = new JButton("Volver");

        registrarBtn.addActionListener(e -> registrarUsuario());
        cancelarBtn.addActionListener(e -> {
            if (loginFrame != null) loginFrame.setVisible(true);
            dispose();
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 5, 5));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel("Apellido:"));
        panel.add(apellidoField);
        panel.add(new JLabel("Correo:"));
        panel.add(correoField);
        panel.add(new JLabel("Telefono:"));
        panel.add(telefonoField);
        panel.add(new JLabel("Nombre de usuario:"));
        panel.add(usuarioField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(contrasenaField);
        panel.add(registrarBtn);
        panel.add(cancelarBtn);

        add(panel);
        pack();
    }

    private void registrarUsuario() {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String correo = correoField.getText();
        String telefono = telefonoField.getText();
        String nombreUsuario = usuarioField.getText();
        String contrasena = new String(contrasenaField.getPassword());

        boolean creado = auth.registrarUsuario(nombre, apellido, correo, telefono, nombreUsuario, contrasena);
        if (creado) {
            JOptionPane.showMessageDialog(this, "Usuario registrado correctamente");
            if (loginFrame != null) loginFrame.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

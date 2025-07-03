package com.mycompany.fixya;

import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import com.mycompany.fixya.ImageUtils;

/**
 * Pantalla para registrar un nuevo cliente mostrando la imagen de fondo y los
 * campos de entrada sobre ella.
 */
public class CrearCliente extends JFrame {
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField correoField;
    private JTextField telefonoField;
    private JTextField dniField;
    private JButton crearBtn;
    private JLabel fondoLabel;

    private ClienteDAO clienteDAO;

    public CrearCliente() {
        clienteDAO = new ClienteDAO();
        initUI();
        SwingUtilities.invokeLater(() ->
            ImageUtils.setImageLabel(fondoLabel, "/CrearClientes.png"));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void initUI() {
        fondoLabel = new JLabel();
        fondoLabel.setLayout(new AbsoluteLayout());

        nombreField = new JTextField();
        apellidoField = new JTextField();
        correoField = new JTextField();
        telefonoField = new JTextField();
        dniField = new JTextField();
        crearBtn = new JButton("Crear cliente");
        crearBtn.addActionListener(e -> crearCliente());

        // Posiciones aproximadas sobre la imagen de fondo (1920x1080)
        fondoLabel.add(nombreField, new AbsoluteConstraints(700, 250, 500, 30));
        fondoLabel.add(apellidoField, new AbsoluteConstraints(700, 300, 500, 30));
        fondoLabel.add(correoField, new AbsoluteConstraints(700, 350, 500, 30));
        fondoLabel.add(telefonoField, new AbsoluteConstraints(700, 400, 500, 30));
        fondoLabel.add(dniField, new AbsoluteConstraints(700, 450, 500, 30));
        fondoLabel.add(crearBtn, new AbsoluteConstraints(700, 500, 150, 40));

        getContentPane().setLayout(new AbsoluteLayout());
        getContentPane().add(fondoLabel, new AbsoluteConstraints(0, 0, 1920, 1080));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    private void crearCliente() {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String correo = correoField.getText();
        String telefono = telefonoField.getText();
        int dni;
        try {
            dni = Integer.parseInt(dniField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "DNI inválido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente(nombre, apellido, correo, telefono, dni);
        boolean ok = clienteDAO.insertarCliente(cliente);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Cliente creado correctamente");
            nombreField.setText("");
            apellidoField.setText("");
            correoField.setText("");
            telefonoField.setText("");
            dniField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo crear el cliente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CrearCliente().setVisible(true));
    }
}

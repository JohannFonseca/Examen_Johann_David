import javax.swing.*;
import java.awt.*;

public class Inicio {
    private JFrame ventanaInicio;
    private JTextField txtNombre;
    private JTextField txtCedula;
    private JTextField txtProcedencia;

    // Constructor
    public void mostrarVentana() {
        // Crear la ventana de inicio
        ventanaInicio = new JFrame("Inicio");
        ventanaInicio.setSize(450, 450);
        ventanaInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal con un diseño de cuadrícula
        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        panelPrincipal.setBackground(new Color(240, 240, 240)); // Color de fondo
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Etiqueta y campo de texto para el nombre
        JLabel labelNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20);
        panelPrincipal.add(labelNombre, gbc);
        gbc.gridx++;
        panelPrincipal.add(txtNombre, gbc);

        // Etiqueta y campo de texto para la cédula
        gbc.gridx = 0;
        gbc.gridy++;
        JLabel labelCedula = new JLabel("Cédula:");
        txtCedula = new JTextField(20);
        panelPrincipal.add(labelCedula, gbc);
        gbc.gridx++;
        panelPrincipal.add(txtCedula, gbc);

        // Etiqueta y campo de texto para el lugar de procedencia
        gbc.gridx = 0;
        gbc.gridy++;
        JLabel labelProcedencia = new JLabel("Lugar de Procedencia:");
        txtProcedencia = new JTextField(20);
        panelPrincipal.add(labelProcedencia, gbc);
        gbc.gridx++;
        panelPrincipal.add(txtProcedencia, gbc);

        // Espacio en blanco para separar los campos de texto de los botones
        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        panelPrincipal.add(Box.createVerticalStrut(20), gbc);

        // Botón para aceptar los datos ingresados
        gbc.gridy++;
        JButton btnAceptar = new JButton("Siguiente");
        btnAceptar.setPreferredSize(new Dimension(100, 30));
        btnAceptar.addActionListener(e -> {
            // Guardar los datos ingresados en la clase
            String nombre = txtNombre.getText();
            String cedula = txtCedula.getText();
            String procedencia = txtProcedencia.getText();

            // Crear una instancia de la clase CalculadoraHuellaCarbono y mostrar su ventana
            CalculadoraHuellaCarbono calculadora = new CalculadoraHuellaCarbono(nombre, cedula, procedencia);
            calculadora.mostrarVentana();

            // Cerrar la ventana actual de Inicio
            ventanaInicio.dispose();
        });
        panelPrincipal.add(btnAceptar, gbc);

        // Agregar el panel principal a la ventana
        ventanaInicio.add(panelPrincipal);
        ventanaInicio.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        ventanaInicio.setVisible(true); // Hacer visible la ventana
    }

    // Método para obtener el nombre ingresado
    public String getNombre() {
        return txtNombre.getText();
    }

    // Método para obtener la cédula ingresada
    public String getCedula() {
        return txtCedula.getText();
    }

    // Método para obtener el lugar de procedencia ingresado
    public String getProcedencia() {
        return txtProcedencia.getText();
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        Inicio inicio = new Inicio();
    }
}

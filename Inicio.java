import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Inicio {
    private JFrame ventanaInicio;

    public void mostrarVentana() {
        // Crear la ventana de inicio
        ventanaInicio = new JFrame("Inicio");
        ventanaInicio.setSize(400, 300);
        ventanaInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal con un diseño de cuadrícula
        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10);

        // Componentes para ingresar datos
        JLabel labelNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField(20);
        panelPrincipal.add(labelNombre, gbc);
        gbc.gridy++;
        panelPrincipal.add(txtNombre, gbc);

        JLabel labelCedula = new JLabel("Cédula:");
        JTextField txtCedula = new JTextField(20);
        panelPrincipal.add(labelCedula, gbc);
        gbc.gridy++;
        panelPrincipal.add(txtCedula, gbc);

        JLabel labelProcedencia = new JLabel("Lugar de Procedencia:");
        JTextField txtProcedencia = new JTextField(20);
        panelPrincipal.add(labelProcedencia, gbc);
        gbc.gridy++;
        panelPrincipal.add(txtProcedencia, gbc);

        // Botón para aceptar y guardar los datos
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setPreferredSize(new Dimension(100, 30));
        btnAceptar.addActionListener(e -> {
            // Obtener los datos ingresados
            String nombre = txtNombre.getText();
            String cedula = txtCedula.getText();
            String procedencia = txtProcedencia.getText();

            // Guardar los datos en un HashMap
            HashMap<String, String> datos = new HashMap<>();
            datos.put("Nombre", nombre);
            datos.put("Cédula", cedula);
            datos.put("Procedencia", procedencia);

            // Abrir la ventana de la calculadora de huella de carbono
            CalculadoraHuellaCarbono calculadora = new CalculadoraHuellaCarbono();
            calculadora.mostrarVentana();

            // Cerrar la ventana de inicio
            ventanaInicio.dispose();
        });
        panelPrincipal.add(btnAceptar, gbc);

        // Botón para regresar a la ventana de bienvenida
        JButton btnRegresar = new JButton("Regresar");
        btnRegresar.setPreferredSize(new Dimension(100, 30));
        btnRegresar.addActionListener(e -> {
            Bienvenida bienvenida = new Bienvenida();
            bienvenida.main(null);
            ventanaInicio.dispose(); // Cerrar la ventana de inicio
        });
        gbc.gridx++;
        panelPrincipal.add(btnRegresar, gbc);

        // Agregar el panel principal a la ventana
        ventanaInicio.add(panelPrincipal);
        ventanaInicio.setLocationRelativeTo(null);
        ventanaInicio.setVisible(true);
    }

    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.mostrarVentana();
    }
}
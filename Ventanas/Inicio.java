import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Inicio {
    private JFrame ventanaInicio;

    public void mostrarVentana() {
        ventanaInicio = new JFrame("Inicio");
        ventanaInicio.setSize(400, 300);
        ventanaInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10);

        JLabel labelNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField(20);
        panelPrincipal.add(labelNombre, gbc);
        gbc.gridy++;
        panelPrincipal.add(txtNombre, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        JLabel labelCedula = new JLabel("Cédula:");
        JTextField txtCedula = new JTextField(20);
        panelPrincipal.add(labelCedula, gbc);
        gbc.gridy++;
        panelPrincipal.add(txtCedula, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        JLabel labelProcedencia = new JLabel("Lugar de Procedencia:");
        JTextField txtProcedencia = new JTextField(20);
        panelPrincipal.add(labelProcedencia, gbc);
        gbc.gridy++;
        panelPrincipal.add(txtProcedencia, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setPreferredSize(new Dimension(100, 30));
        btnAceptar.addActionListener(e -> {
            // Guardar los datos ingresados
            String nombre = txtNombre.getText();
            String cedula = txtCedula.getText();
            String procedencia = txtProcedencia.getText();

            // Guardar los datos en algún lugar, por ejemplo, un HashMap
            HashMap<String, String> datos = new HashMap<>();
            datos.put("Nombre", nombre);
            datos.put("Cédula", cedula);
            datos.put("Procedencia", procedencia);

            // Abrir la ventana de la calculadora
            CalculadoraHuellaCarbono calculadora = new CalculadoraHuellaCarbono();
            calculadora.mostrarVentana();
            ventanaInicio.dispose(); // Cerrar la ventana de inicio
        });
        panelPrincipal.add(btnAceptar, gbc);

        JButton btnRegresar = new JButton("Regresar");
        btnRegresar.setPreferredSize(new Dimension(100, 30));
        btnRegresar.addActionListener(e -> {
            // Regresar a la ventana de la calculadora de huella de carbono
            CalculadoraHuellaCarbono calculadora = new CalculadoraHuellaCarbono();
            calculadora.mostrarVentana();
            ventanaInicio.dispose(); // Cerrar la ventana de inicio
        });
        gbc.gridx++;
        panelPrincipal.add(btnRegresar, gbc);

        ventanaInicio.add(panelPrincipal);
        ventanaInicio.setLocationRelativeTo(null);
        ventanaInicio.setVisible(true);
    }

    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.mostrarVentana();
    }
}


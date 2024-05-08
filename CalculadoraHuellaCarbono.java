// CalculadoraHuellaCarbono.java
import javax.swing.*;
import java.awt.*;

public class CalculadoraHuellaCarbono {
    public void mostrarVentana() {
        // Crear la ventana de la calculadora
        JFrame ventanaCalculadora = new JFrame("Calculadora de Huella de Carbono");
        ventanaCalculadora.setSize(500, 325);
        ventanaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal con un diseño de cuadrícula
        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        panelPrincipal.setBackground(new Color(204, 255, 204)); // Fondo verde claro
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10);

        // Panel para preguntas
        JPanel panelPreguntas = new JPanel();
        panelPreguntas.setLayout(new BoxLayout(panelPreguntas, BoxLayout.Y_AXIS));

        // Etiquetas y campos de texto para preguntas
        JLabel labelPregunta2 = new JLabel("¿Cuántas veces a la semana comes carne?");
        JTextField txtRespuesta2 = new JTextField(3);
        gbc.gridwidth = 2;
        panelPrincipal.add(labelPregunta2, gbc);
        gbc.gridy++;
        panelPrincipal.add(txtRespuesta2, gbc);
        gbc.gridy++;

        JLabel labelPregunta3 = new JLabel("¿Cuántas veces a la semana viajas en avión?");
        JTextField txtRespuesta3 = new JTextField(3);
        panelPrincipal.add(labelPregunta3, gbc);
        gbc.gridy++;
        panelPrincipal.add(txtRespuesta3, gbc);
        gbc.gridy++;

        // Botón para calcular la huella de carbono
        JButton btnCalcular = new JButton("Calcular Huella de Carbono");
        btnCalcular.addActionListener(e -> {
            // Realizar el cálculo aquí
            JOptionPane.showMessageDialog(null, "¡Cálculo realizado! (¡Falta implementar!)");
        });
        panelPrincipal.add(btnCalcular, gbc);

        // Agregar paneles al panel principal
        panelPrincipal.add(panelPreguntas);
        panelPrincipal.add(btnCalcular);

        // Agregar panel principal a la ventana
        ventanaCalculadora.getContentPane().add(panelPrincipal, BorderLayout.CENTER);

        // Centrar la ventana en la pantalla
        ventanaCalculadora.setLocationRelativeTo(null);
        ventanaCalculadora.setVisible(true);
    }

    public static void main(String[] args) {
        CalculadoraHuellaCarbono calculadora = new CalculadoraHuellaCarbono();
        calculadora.mostrarVentana();
    }
}




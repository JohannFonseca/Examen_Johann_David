import javax.swing.*;
import java.awt.*;

public class CalculadoraHuellaCarbono {
    public void mostrarVentana() {
        // Crear la ventana de la calculadora
        JFrame ventanaCalculadora = new JFrame("Calculadora de Huella de Carbono");
        ventanaCalculadora.setSize(400, 325);
        ventanaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel principal con color de fondo verde claro
        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        panelPrincipal.setBackground(new Color(204, 255, 204)); // Verde clarito
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10); // Margen

        // Crear componentes visuales para las preguntas
        JPanel panelPreguntas = new JPanel();
        panelPreguntas.setLayout(new BoxLayout(panelPreguntas, BoxLayout.Y_AXIS));

        // Pregunta 1
        JLabel labelPregunta1 = new JLabel("¿Cuál es su nombre?");
        JTextField txtRespuesta1 = new JTextField(3);
        gbc.gridwidth = 2; // Centra la etiqueta ocupando dos columnas
        panelPrincipal.add(labelPregunta1, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1; // Restaura el valor de gridwidth a 1 para los componentes siguientes
        panelPrincipal.add(txtRespuesta1, gbc);
        gbc.gridx = 0;
        gbc.gridy++;


        
        // Pregunta 2
        JLabel labelPregunta2 = new JLabel("¿Cuántas veces a la semana comes carne?");
        JTextField txtRespuesta2 = new JTextField(3); // Campo de texto para la respuesta
        gbc.gridwidth = 2; // Centra la etiqueta ocupando dos columnas
        panelPrincipal.add(labelPregunta2, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1; // Restaura el valor de gridwidth a 1 para los componentes siguientes
        panelPrincipal.add(txtRespuesta2, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        // Pregunta 3
        JLabel labelPregunta3 = new JLabel("¿Cuántos kilómetros conduces tu coche por semana?");
        JTextField txtRespuesta3 = new JTextField(3); // Campo de texto para la respuesta
        gbc.gridwidth = 2;
        panelPrincipal.add(labelPregunta3, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        panelPrincipal.add(txtRespuesta3, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        // Pregunta 4
        JLabel labelPregunta4 = new JLabel("¿Cuántas veces al mes utilizas transporte público?");
        JTextField txtRespuesta4 = new JTextField(3); // Campo de texto para la respuesta
        gbc.gridwidth = 2;
        panelPrincipal.add(labelPregunta4, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        panelPrincipal.add(txtRespuesta4, gbc);
        gbc.gridx = 0;
        gbc.gridy++;


        // Pregunta 5
        JLabel labelPregunta5 = new JLabel("¿Cuántas veces compras productos empaquetados por semana?");
        JTextField txtRespuesta5 = new JTextField(3); // Campo de texto para la respuesta
        gbc.gridwidth = 2;
        panelPrincipal.add(labelPregunta5, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        panelPrincipal.add(txtRespuesta5, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        // Crear un botón para calcular
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setPreferredSize(new Dimension(60, 30)); // Tamaño personalizado
        btnCalcular.addActionListener(e -> {
            // Obtener respuestas del usuario
            String respuesta1 = txtRespuesta1.getText();
            int respuesta2 = Integer.parseInt(txtRespuesta2.getText());
            int respuesta3 = Integer.parseInt(txtRespuesta3.getText());
            int respuesta4 = Integer.parseInt(txtRespuesta4.getText());
            int respuesta5 = Integer.parseInt(txtRespuesta5.getText());

            // Calcular huella de carbono (aquí solo un ejemplo)
            double huellaCarbono = calcularHuellaCarbono(respuesta1, respuesta2, respuesta3, respuesta4, respuesta5);

            // Mostrar el resultado en un JOptionPane
            String mensaje = "La huella de carbono calculada es: " + huellaCarbono + "\n\n¿Qué deseas hacer?";
            Object[] opciones = {"Consejos", "Aceptar", "Cerrar"};
            int seleccion = JOptionPane.showOptionDialog(null, mensaje, "Resultado",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
            null, opciones, opciones[0]);

             // Manejar la selección del usuario
    switch (seleccion) {
        case 0:
            // Opción "Consejos"
            Consejos consejos = new Consejos();
            consejos.mostrarVentana();
            break;
        case 1:
            // Opción "Aceptar"
            // Hacer algo si el usuario elige "Aceptar"
            break;
        case 2:
            // Opción "Cerrar"
            ventanaCalculadora.dispose(); // Cerrar la ventana actual
            break;
        default:
            // Por defecto, no hacer nada
            break;
    }
        });

        // Botón de regreso
        JButton btnRegresar = new JButton("Regresar");
        btnRegresar.setPreferredSize(new Dimension(30, 30)); // Tamaño personalizado
        btnRegresar.addActionListener(e -> {
            // Abrir la ventana de bienvenida
            Bienvenida bienvenida = new Bienvenida();
            bienvenida.main(null); // Llama al método main de la clase Bienvenida
            ventanaCalculadora.dispose(); // Cerrar la ventana actual
        });

        // Agregar componentes al panel principal
        panelPrincipal.add(panelPreguntas);
        // Agregar botones al panel principal
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelPrincipal.add(btnCalcular, gbc);

        gbc.gridx++;
        panelPrincipal.add(btnRegresar, gbc);

        // Agregar el panel principal a la ventana
        ventanaCalculadora.add(panelPrincipal);

        // Centrar la ventana en la pantalla
        ventanaCalculadora.setLocationRelativeTo(null);

        // Mostrar la ventana de la calculadora
        ventanaCalculadora.setVisible(true);
    }

    private double calcularHuellaCarbono(int respuesta1, int respuesta2, int respuesta3, int respuesta4) {
        // Lógica para calcular la huella de carbono
        double huellaCarbono = (respuesta1 * 0.5) + (respuesta2 * 0.1) + (respuesta3 * 0.05) + (respuesta4 * 0.5);
        return huellaCarbono;
    }

    public static void main(String[] args) {
        CalculadoraHuellaCarbono calculadora = new CalculadoraHuellaCarbono();
        calculadora.mostrarVentana();
    }
}   



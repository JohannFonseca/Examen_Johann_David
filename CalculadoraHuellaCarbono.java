import javax.swing.*;

public class CalculadoraHuellaCarbono {
    public void mostrarVentana() {
        // Crear la ventana de la calculadora
        JFrame ventanaCalculadora = new JFrame("Calculadora de Huella de Carbono");
        ventanaCalculadora.setSize(400, 300);
        ventanaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes visuales para las preguntas
        JPanel panelPreguntas = new JPanel();
        panelPreguntas.setLayout(new BoxLayout(panelPreguntas, BoxLayout.Y_AXIS));

        // Pregunta 1
        JLabel labelPregunta1 = new JLabel("¿Cuántas veces a la semana comes carne?");
        JTextField txtRespuesta1 = new JTextField(10); // Campo de texto para la respuesta
        JPanel panelPregunta1 = new JPanel();
        panelPregunta1.add(labelPregunta1);
        panelPregunta1.add(txtRespuesta1);
        panelPreguntas.add(panelPregunta1);

        // Pregunta 2
        JLabel labelPregunta2 = new JLabel("¿Cuántos kilómetros conduces tu coche por semana?");
        JTextField txtRespuesta2 = new JTextField(10); // Campo de texto para la respuesta
        JPanel panelPregunta2 = new JPanel();
        panelPregunta2.add(labelPregunta2);
        panelPregunta2.add(txtRespuesta2);
        panelPreguntas.add(panelPregunta2);

        // Pregunta 3
        JLabel labelPregunta3 = new JLabel("¿Cuántas veces al mes utilizas transporte público?");
        JTextField txtRespuesta3 = new JTextField(10); // Campo de texto para la respuesta
        JPanel panelPregunta3 = new JPanel();
        panelPregunta3.add(labelPregunta3);
        panelPregunta3.add(txtRespuesta3);
        panelPreguntas.add(panelPregunta3);

        // Pregunta 4
        JLabel labelPregunta4 = new JLabel("¿Cuántas veces compras productos empaquetados por semana?");
        JTextField txtRespuesta4 = new JTextField(10); // Campo de texto para la respuesta
        JPanel panelPregunta4 = new JPanel();
        panelPregunta4.add(labelPregunta4);
        panelPregunta4.add(txtRespuesta4);
        panelPreguntas.add(panelPregunta4);

        // Crear un botón para calcular
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(e -> {
            // Aquí iría la lógica para calcular la huella de carbono
            // Por simplicidad, aquí solo cerraremos la ventana de la calculadora
            ventanaCalculadora.dispose();
            // Luego puedes abrir la siguiente ventana o realizar otras acciones según tu lógica
            VentanaLimpia ventanaLimpia = new VentanaLimpia();
            ventanaLimpia.mostrarVentana();
        });

        // Agregar componentes al panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.add(panelPreguntas);
        panelPrincipal.add(btnCalcular);

        // Agregar el panel principal a la ventana
        ventanaCalculadora.add(panelPrincipal);
        
        // Centrar la ventana en la pantalla
        ventanaCalculadora.setLocationRelativeTo(null);
        
        // Mostrar la ventana de la calculadora
        ventanaCalculadora.setVisible(true);
    }
}
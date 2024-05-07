import javax.swing.*;

public class CalculadoraHuellaCarbono {
    public void mostrarVentana() {
        // Crear la ventana de la calculadora
        JFrame ventanaCalculadora = new JFrame("Calculadora de Huella de Carbono");
        ventanaCalculadora.setSize(400, 300);
        ventanaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes visuales para las preguntas (por ejemplo, JLabels y JTextFields)
        JLabel labelPregunta1 = new JLabel("¿Cuántas veces a la semana comes carne?");
        JTextField txtRespuesta1 = new JTextField();

        // Crear un botón para pasar a la siguiente pregunta
        JButton btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(e -> {
            // Aquí iría la lógica para pasar a la siguiente pregunta o a la ventana limpia
            // Por simplicidad, aquí solo cerraremos la ventana de la calculadora
            ventanaCalculadora.dispose();
            // Luego puedes abrir la siguiente ventana o realizar otras acciones según tu lógica
        });

        // Agregar componentes a la ventana
        ventanaCalculadora.setLayout(new BoxLayout(ventanaCalculadora.getContentPane(), BoxLayout.Y_AXIS));
        ventanaCalculadora.add(labelPregunta1);
        ventanaCalculadora.add(txtRespuesta1);
        ventanaCalculadora.add(btnSiguiente);
        
        // Mostrar la ventana de la calculadora
        ventanaCalculadora.setVisible(true);
    }
}


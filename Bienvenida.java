import javax.swing.*;

public class Bienvenida {
    public static void main(String[] args) {
        // Crear la ventana de bienvenida
        JFrame ventanaBienvenida = new JFrame("Bienvenida");
        ventanaBienvenida.setSize(300, 200);
        ventanaBienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un mensaje de bienvenida
        JLabel labelBienvenida = new JLabel("¡Bienvenido a la Calculadora de Huella de Carbono!");
        labelBienvenida.setHorizontalAlignment(SwingConstants.CENTER);

        // Crear un botón para iniciar el cálculo
        JButton btnIniciar = new JButton("Iniciar Cálculo");
        btnIniciar.addActionListener(e -> {
            // Abrir la ventana de la calculadora
            CalculadoraHuellaCarbono calculadora = new CalculadoraHuellaCarbono();
            calculadora.mostrarVentana();
            ventanaBienvenida.dispose(); // Cerrar la ventana de bienvenida
        });

        // Agregar componentes a la ventana
        ventanaBienvenida.add(labelBienvenida);
        ventanaBienvenida.add(btnIniciar);
        ventanaBienvenida.setLayout(new BoxLayout(ventanaBienvenida.getContentPane(), BoxLayout.Y_AXIS));
        ventanaBienvenida.setVisible(true);
    }
}



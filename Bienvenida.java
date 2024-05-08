import javax.swing.*;
import java.awt.*;

public class Bienvenida {
    public static void main(String[] args) {
        // Crear la ventana de bienvenida
        JFrame ventanaBienvenida = new JFrame("Bienvenida");
        ventanaBienvenida.setSize(800, 400);
        ventanaBienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel con un color de fondo verde claro
        JPanel panelFondo = new JPanel();
        panelFondo.setBackground(new Color(204, 255, 204)); // Verde clarito

        // Crear un borde para el panel
        panelFondo.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 0), 5)); // Verde oscuro

        // Configurar el diseño del panel
        panelFondo.setLayout(new BorderLayout());

        // Crear un mensaje de bienvenida
        JLabel labelBienvenida1 = new JLabel("¡Bienvenido a la Calculadora", SwingConstants.CENTER);
        JLabel labelBienvenida2 = new JLabel("de Huella de Carbono!", SwingConstants.CENTER);

        // Configurar las fuentes y tamaños de texto
        Font font = new Font("Arial", Font.BOLD, 24);
        labelBienvenida1.setFont(font);
        labelBienvenida2.setFont(font);

        // Agregar los mensajes de bienvenida al panel
        panelFondo.add(labelBienvenida1, BorderLayout.NORTH);
        panelFondo.add(labelBienvenida2, BorderLayout.CENTER);

        // Crear un botón para iniciar el cálculo
        JButton btnIniciar = new JButton("Iniciar Cálculo");
        btnIniciar.addActionListener(e -> {
            // Abrir la ventana de la calculadora
            CalculadoraHuellaCarbono calculadora = new CalculadoraHuellaCarbono();
            calculadora.mostrarVentana();
            ventanaBienvenida.dispose(); // Cerrar la ventana de bienvenida
        });

        // Agregar el botón al panel
        panelFondo.add(btnIniciar, BorderLayout.SOUTH);

        // Agregar el panel a la ventana
        ventanaBienvenida.add(panelFondo);

        ventanaBienvenida.setVisible(true);
    }
}




import javax.swing.*;
import java.awt.*;

public class Bienvenida {
    public static void main(String[] args) {
        // Crear la ventana de bienvenida
        JFrame ventanaBienvenida = new JFrame("Bienvenida");
        ventanaBienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel con un color de fondo verde claro
        JPanel panelFondo = new JPanel();
        panelFondo.setBackground(new Color(204, 255, 204)); // Verde clarito
        panelFondo.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 0), 5)); // Borde verde oscuro

        // Crear un mensaje de bienvenida
        JLabel labelBienvenida1 = new JLabel("¡Bienvenido a la Calculadora", SwingConstants.CENTER);
        JLabel labelBienvenida2 = new JLabel("de Huella de Carbono!", SwingConstants.CENTER);

        // Configurar las fuentes y tamaños de texto
        Font font = new Font("Arial", Font.BOLD, 24);
        labelBienvenida1.setFont(font);
        labelBienvenida2.setFont(font);

        // Crear un botón para iniciar el cálculo
        JButton btnIniciar = new JButton("Iniciar Cálculo");
        btnIniciar.setPreferredSize(new Dimension(300, 50)); // Doble del tamaño original

        // Configurar el diseño del panelFondo
        GroupLayout layout = new GroupLayout(panelFondo);
        panelFondo.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Configurar el GroupLayout
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(labelBienvenida1)
                .addComponent(labelBienvenida2)
                .addComponent(btnIniciar)
        );
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGap(100) // Espacio superior
                .addComponent(labelBienvenida1)
                .addComponent(labelBienvenida2)
                .addGap(100) // Espacio entre el texto y el botón
                .addComponent(btnIniciar)
        );

        // Agregar el panel a la ventana
        ventanaBienvenida.getContentPane().add(panelFondo, BorderLayout.CENTER);

        // Centrar la ventana en la pantalla
        ventanaBienvenida.pack();
        ventanaBienvenida.setLocationRelativeTo(null);

        ventanaBienvenida.setVisible(true);
    }
}
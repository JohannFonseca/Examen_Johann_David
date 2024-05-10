package Vista;

import javax.swing.*;

import Controlador.Inicio;
import Modelo.Informacion;

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

        ImageIcon iconoInformacion = resizeImageIcon(new ImageIcon("images/idea.png"), 30, 50);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setPreferredSize(new Dimension(300, 50)); // Tamaño del botón
        btnIniciar.addActionListener(e -> {
            // Obtener los datos del usuario de la clase Inicio
            Inicio inicio = new Inicio();
            inicio.mostrarVentana();
            ventanaBienvenida.dispose();
        });

        // Crear un botón para ver información
        JButton btnInformacion = new JButton(iconoInformacion);
        btnInformacion.addActionListener(e -> {
            // Abrir la ventana de información
            Informacion info = new Informacion();
            info.mostrarVentana();
            ventanaBienvenida.dispose(); // Cerrar la ventana de bienvenida
        });

        // Configurar el diseño del panelFondo
        GroupLayout layout = new GroupLayout(panelFondo);
        panelFondo.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(labelBienvenida1)
                .addComponent(labelBienvenida2)
                .addComponent(btnIniciar)
                .addComponent(btnInformacion) // Agregar el nuevo botón
        );
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGap(100) // Espacio superior
                .addComponent(labelBienvenida1)
                .addComponent(labelBienvenida2)
                .addGap(100) 
                .addComponent(btnIniciar)
                .addComponent(btnInformacion) // Agregar el nuevo botón
        );

        // Agregar el panel a la ventana
        ventanaBienvenida.getContentPane().add(panelFondo, BorderLayout.CENTER);

        // Centrar la ventana en la pantalla
        ventanaBienvenida.pack();
        ventanaBienvenida.setLocationRelativeTo(null);

        ventanaBienvenida.setVisible(true);

    }

    private static ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }

}

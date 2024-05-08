import javax.swing.*;
import java.awt.*;

public class Bienvenida {
    public static void main(String[] args) {

        // aqui creo la ventanay su titulo
        JFrame ventanaBienvenida = new JFrame("Bienvenida");
        ventanaBienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // aqui es el panel y el colorcito verde
        JPanel panelFondo = new JPanel();
        panelFondo.setBackground(new Color(204, 255, 204)); // Verde clarito
        panelFondo.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 0), 5)); // Borde verde oscuro

        // cree un mensaje de 
        JLabel labelBienvenida1 = new JLabel("¡Bienvenido a la Calculadora", SwingConstants.CENTER);
        JLabel labelBienvenida2 = new JLabel("de Huella de Carbono!", SwingConstants.CENTER);

        // Tamaños y fuentes
        Font font = new Font("Arial", Font.BOLD, 24);
        labelBienvenida1.setFont(font);
        labelBienvenida2.setFont(font);

        // boton funcional
        JButton btnIniciar = new JButton("Iniciar Cálculo");
        btnIniciar.setPreferredSize(new Dimension(300, 50)); // tamaño del boton
        btnIniciar.addActionListener(e -> {

            // abrir ventana siguiente
            CalculadoraHuellaCarbono calculadora = new CalculadoraHuellaCarbono();
            calculadora.mostrarVentana();
            ventanaBienvenida.dispose(); // para cerrar la ventana de bienvenida
        });

        // para configurar el diseño del panelFondo
        GroupLayout layout = new GroupLayout(panelFondo);
        panelFondo.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

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


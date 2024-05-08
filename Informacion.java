import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Informacion {
    public void mostrarVentana() {
        // Crear la ventana de información
        JFrame ventanaInformacion = new JFrame("Información");
        ventanaInformacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel con un color de fondo blanco
        JPanel panelFondo = new JPanel();
        panelFondo.setBackground(Color.WHITE);
        panelFondo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Agrega un borde interno

        // Texto sobre la huella de carbono
        String textoHuellaCarbono = "<html><body><h1>¿Qué es la huella de carbono?</h1>"
                                    + "<p>La huella de carbono es una medida de la cantidad total de gases de efecto invernadero (GEI) emitidos a la atmósfera debido a las actividades humanas, expresada en términos de dióxido de carbono equivalente (CO2e). Estas emisiones provienen principalmente de la quema de combustibles fósiles como el petróleo, el gas natural y el carbón para generar energía, así como de actividades como la producción industrial, la agricultura y el transporte.</p>"
                                    + "<h1>¿Por qué es importante reducir nuestra huella de carbono?</h1>"
                                    + "<p>Reducir nuestra huella de carbono es crucial para combatir el cambio climático y sus impactos devastadores en el medio ambiente y la sociedad. Algunas formas de reducir nuestra huella de carbono incluyen el uso de energías renovables, la eficiencia energética, la adopción de prácticas agrícolas sostenibles, el transporte sostenible y la reducción del consumo de productos con alto contenido de carbono.</p>"
                                    + "<h1>¿Cómo podemos reducir nuestra huella de carbono?</h1>"
                                    + "<p>Pequeñas acciones individuales, como caminar o andar en bicicleta en lugar de conducir, reducir el consumo de carne y productos lácteos, y reciclar y reutilizar materiales, pueden marcar una gran diferencia cuando se trata de reducir nuestra huella de carbono y crear un futuro más sostenible para todos.</p>"
                                    + "</body></html>";

        // Crear un JLabel para mostrar el texto
        JLabel labelInformacion = new JLabel(textoHuellaCarbono);
        labelInformacion.setFont(new Font("Arial", Font.PLAIN, 16)); // Cambia la fuente y el tamaño según tus preferencias

        // Crear un botón de regresar
        JButton btnRegresar = new JButton("Regresar");
        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanaInformacion.dispose(); // Cerrar la ventana actual
                Bienvenida bienvenida = new Bienvenida();
                bienvenida.main(null); // Mostrar la ventana de bienvenida
            }
        });

        // Crear un panel para el botón de regresar y centrarlo
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.add(btnRegresar);

        // Crear un panel para organizar el contenido
        JPanel panelContenido = new JPanel(new BorderLayout());
        panelContenido.add(labelInformacion, BorderLayout.CENTER);
        panelContenido.add(panelBoton, BorderLayout.SOUTH);

        // Agregar el panel de contenido al panel principal
        panelFondo.add(panelContenido);

        // Agregar el panel a la ventana
        ventanaInformacion.getContentPane().add(panelFondo, BorderLayout.CENTER);

        // Centrar la ventana en la pantalla
        ventanaInformacion.pack();
        ventanaInformacion.setLocationRelativeTo(null);

        ventanaInformacion.setVisible(true);
    }

    public static void main(String[] args) {
        Informacion info = new Informacion();
        info.mostrarVentana();
    }
}


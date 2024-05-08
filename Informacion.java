import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Informacion {
    public void mostrarVentana() {
        
        JFrame ventanaInformacion = new JFrame("Información");
        ventanaInformacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panelFondo = new JPanel();
        panelFondo.setBackground(Color.WHITE);
        panelFondo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // agrega un borde interno

        // Texto sobre la huella de carbono
        String textoHuellaCarbono = "<html><body>"
                                    + "<h1>¿Qué es la huella de carbono?</h1>"
                                    + "<p>La huella de carbono es una medida de la cantidad total de gases de efecto invernadero (GEI) emitidos a </p>"
                                    +"<p>la atmósfera debido a las actividades humanas, expresada en términos de dióxido de carbono equivalente (CO2e).<p>"
                                    + "<p>Estas emisiones provienen principalmente de la quema de combustibles fósiles como el petróleo, el gas natural<p>"
                                    +"<p> y el carbón para generar energía, así como de actividades como la producción industrial, la agricultura y el transporte.</p>"
                                    + "<h1>¿Por qué es importante reducir nuestra huella de carbono?</h1>"
                                    + "<p>Reducir nuestra huella de carbono es crucial para combatir el cambio climático y sus impactos devastadores en el medio ambiente y la sociedad.</p>"
                                    + "<p>Algunas formas de reducir nuestra huella de carbono incluyen el uso de energías renovables, la eficiencia energética, la adopción de prácticas <p>"
                                    + "<p>agrícolas sostenibles, el transporte sostenible y la reducción del consumo de productos con alto contenido de carbono.</p>"
                                    + "<h1>¿Cómo podemos reducir nuestra huella de carbono?</h1>"
                                    + "<p>Pequeñas acciones individuales, como caminar o andar en bicicleta en lugar de conducir, reducir el consumo de carne y productos lácteos, y reciclar<p."
                                    + "<p>y reutilizar materiales, pueden marcar una gran diferencia cuando se trata de reducir nuestra huella de carbono y crear un futuro más sostenible para todos.</p>"
                                    + "</body></html>";

        
        JLabel labelInformacion = new JLabel(textoHuellaCarbono);
        labelInformacion.setFont(new Font("Arial", Font.PLAIN, 16)); // para cambiar la fuente y el tamaño según tus preferencias

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

        // Crear un panel para organizar el contenido verticalmente
        JPanel panelContenido = new JPanel();
        panelContenido.setLayout(new BoxLayout(panelContenido, BoxLayout.Y_AXIS));
        panelContenido.add(labelInformacion);
        panelContenido.add(Box.createVerticalGlue()); // Espacio vertical flexible
        panelContenido.add(panelBoton);

        // Agregar el panel de contenido al panel principal
        panelFondo.add(panelContenido);

        // Agregar el panel a la ventana
        ventanaInformacion.getContentPane().add(panelFondo, BorderLayout.CENTER);

        // Ajustar el tamaño de la ventana para que se adapte al contenido
        ventanaInformacion.setSize(1000, 440); // Menos ancho y más largo

        // Centrar la ventana en la pantalla
        ventanaInformacion.setLocationRelativeTo(null);

        ventanaInformacion.setVisible(true);
    }

    public static void main(String[] args) {
        Informacion info = new Informacion();
        info.mostrarVentana();
    }
}



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Informacion {
    public void mostrarVentana() {
        // Crear la ventana de información
        JFrame ventanaInformacion = new JFrame("Información");
        ventanaInformacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel con fondo verde suave
        JPanel panelFondo = new JPanel(new BorderLayout());
        panelFondo.setBackground(new Color(204, 255, 204)); // Verde suave

        // Texto sobre la huella de carbono
        String textoHuellaCarbono = "<html><body>"
                                    + "<h1 style='font-family: Arial;'>¿Qué es la huella de carbono?</h1>"
                                    + "<p style='font-family: Arial;'>La huella de carbono es una medida de la cantidad total de gases de efecto invernadero (GEI) emitidos a"
                                    + " la atmósfera debido a las actividades humanas, expresada en términos de dióxido de carbono equivalente (CO2e).</p>"
                                    + "<p style='font-family: Arial;'>Estas emisiones provienen principalmente de la quema de combustibles fósiles como el petróleo, el gas natural, "
                                    + "y el carbón para generar energía, así como de actividades como la producción industrial, la agricultura y el transporte.</p>"
                                    + "<h1 style='font-family: Arial;'>¿Por qué es importante reducir nuestra huella de carbono?</h1>"
                                    + "<p style='font-family: Arial;'>Reducir nuestra huella de carbono es crucial para combatir el cambio climático y sus impactos devastadores en el medio ambiente y la sociedad.</p>"
                                    + "<p style='font-family: Arial;'>Algunas formas de reducir nuestra huella de carbono incluyen el uso de energías renovables, la eficiencia energética, la adopción de prácticas agrícolas sostenibles, "
                                    + "el transporte sostenible y la reducción del consumo de productos con alto contenido de carbono.</p>"
                                    + "<h1 style='font-family: Arial;'>¿Cómo podemos reducir nuestra huella de carbono?</h1>"
                                    + "<p style='font-family: Arial;'>Pequeñas acciones individuales, como caminar o andar en bicicleta en lugar de conducir, reducir el consumo de carne y productos lácteos, y reciclar y reutilizar materiales, "
                                    + "pueden marcar una gran diferencia cuando se trata de reducir nuestra huella de carbono y crear un futuro más sostenible para todos.</p>"
                                    + "</body></html>";

        // Etiqueta con el texto sobre la huella de carbono
        JLabel labelInformacion = new JLabel(textoHuellaCarbono);

        // Botón de regresar
        JButton btnRegresar = new JButton("Regresar");
        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanaInformacion.dispose(); // Cerrar la ventana actual
                Bienvenida bienvenida = new Bienvenida();
                bienvenida.main(null); // Mostrar la ventana de bienvenida
            }
        });

        // Panel para el botón de regresar
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.add(btnRegresar);

        // Panel para el contenido
        JPanel panelContenido = new JPanel(new BorderLayout());
        panelContenido.add(labelInformacion, BorderLayout.CENTER);
        panelContenido.add(panelBoton, BorderLayout.SOUTH);

        // Agregar el contenido al panel de fondo
        panelFondo.add(panelContenido, BorderLayout.CENTER);

        // Agregar el panel de fondo a la ventana
        ventanaInformacion.getContentPane().add(panelFondo, BorderLayout.CENTER);

        // Configurar tamaño y posición de la ventana
        ventanaInformacion.setSize(1000, 440);
        ventanaInformacion.setLocationRelativeTo(null);

        // Mostrar la ventana
        ventanaInformacion.setVisible(true);
    }

    public static void main(String[] args) {
        Informacion info = new Informacion();
        info.mostrarVentana();
    }
}







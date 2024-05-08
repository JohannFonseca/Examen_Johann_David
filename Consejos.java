import javax.swing.*;

public class Consejos {
    public void mostrarVentana() {
        // Crear la ventana de consejos
        JFrame ventanaConsejos = new JFrame("Tips para mejorar tu huella");
        ventanaConsejos.setSize(500, 150);
        ventanaConsejos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JLabel con los consejos
        JLabel etiquetaConsejos = new JLabel("<html><p>Consejo 1: Utiliza transporte público o bicicleta.</p>"
                                              + "<p>Consejo 2: Reduce el consumo de carne y productos lácteos.</p>"
                                              + "<p>Consejo 3: Ahorra energía apagando luces y electrodomésticos cuando no los uses.</p>"
                                              + "<p>Consejo 4: Recicla y reutiliza materiales siempre que sea posible.</p>"
                                              + "</html>");
        // Agregar la etiqueta a la ventana
        ventanaConsejos.add(etiquetaConsejos);

        // Centrar la ventana en la pantalla
        ventanaConsejos.setLocationRelativeTo(null);


        // Mostrar la ventana limpia
        ventanaConsejos.setVisible(true);
    }

    public static void main(String[] args) {
        Consejos consejos = new Consejos();
        consejos.mostrarVentana();
    }
}



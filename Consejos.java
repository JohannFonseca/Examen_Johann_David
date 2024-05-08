import javax.swing.*;

public class Consejos {
    public void mostrarVentana() {
        // Crear la ventana de consejos
        JFrame ventanaConsejos = new JFrame("Tips para mejorar tu huella");
        ventanaConsejos.setSize(300, 200);
        ventanaConsejos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mostrar la ventana limpia
        ventanaConsejos.setVisible(true);
    }

    public static void main(String[] args) {
        Consejos consejos = new Consejos();
        consejos.mostrarVentana();
    }
}



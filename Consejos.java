import javax.swing.*;

public class Consejos {
    public void mostrarVentana() {
        // Crear la ventana limpia
        JFrame Consejos = new JFrame("Tips para mejorar tu huella");
        Consejos.setSize(300, 200);
        Consejos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mostrar la ventana limpia
        Consejos.setVisible(true);
    }

    public static void main(String[] args) {
        Consejos Consejos = new Consejos();
        Consejos.mostrarVentana();
    }
}


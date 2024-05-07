import javax.swing.*;

public class VentanaLimpia {
    public void mostrarVentana() {
        // Crear la ventana limpia
        JFrame ventanaLimpia = new JFrame("Ventana Limpia");
        ventanaLimpia.setSize(300, 200);
        ventanaLimpia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mostrar la ventana limpia
        ventanaLimpia.setVisible(true);
    }

    public static void main(String[] args) {
        VentanaLimpia ventanaLimpia = new VentanaLimpia();
        ventanaLimpia.mostrarVentana();
    }
}


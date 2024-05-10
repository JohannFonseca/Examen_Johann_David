package Modelo;
import javax.swing.*;

import Vista.Bienvenida;
import Vista.Consejos;

import java.awt.*;

public class CalculadoraHuellaCarbono {

    private String nombre;
    private String cedula;
    private String procedencia;

     // Constructor que recibe los datos del usuario
     public CalculadoraHuellaCarbono(String nombre, String cedula, String procedencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.procedencia = procedencia;
    }

    // Método para establecer los datos del usuario
    public void setDatosUsuario(String nombre, String cedula, String procedencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.procedencia = procedencia;
    }

    public void mostrarVentana() {
        JFrame ventanaCalculadora = new JFrame("Calculadora de Huella de Carbono");
        ventanaCalculadora.setSize(500, 400);
        ventanaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        panelPrincipal.setBackground(new Color(204, 255, 204));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10);

        JPanel panelPreguntas = new JPanel();
        panelPreguntas.setLayout(new BoxLayout(panelPreguntas, BoxLayout.Y_AXIS));

        ImageIcon iconoCalculadora = resizeImageIcon(new ImageIcon("images/Calculadora.jpg"), 30, 30);


        JLabel labelPregunta2 = new JLabel("¿Cuántas veces a la semana comes carne?");
        JTextField txtRespuesta2 = new JTextField(3);
        gbc.gridwidth = 2;
        panelPrincipal.add(labelPregunta2, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        panelPrincipal.add(txtRespuesta2, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        JLabel labelPregunta3 = new JLabel("¿Cuántos kilómetros conduces tu coche por semana?");
        JTextField txtRespuesta3 = new JTextField(3);
        gbc.gridwidth = 2;
        panelPrincipal.add(labelPregunta3, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        panelPrincipal.add(txtRespuesta3, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        JLabel labelPregunta4 = new JLabel("¿Cuántas veces al mes utilizas transporte público?");
        JTextField txtRespuesta4 = new JTextField(3);
        gbc.gridwidth = 2;
        panelPrincipal.add(labelPregunta4, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        panelPrincipal.add(txtRespuesta4, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        JLabel labelPregunta5 = new JLabel("¿Cuántas veces compras productos empaquetados por semana?");
        JTextField txtRespuesta5 = new JTextField(3);
        gbc.gridwidth = 2;
        panelPrincipal.add(labelPregunta5, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        panelPrincipal.add(txtRespuesta5, gbc);
        gbc.gridx = 0;
        gbc.gridy++;

        JButton btnCalcular = new JButton(iconoCalculadora);
        btnCalcular.setPreferredSize(new Dimension(60, 30));
        btnCalcular.addActionListener(e -> {
            int respuesta2 = Integer.parseInt(txtRespuesta2.getText());
            int respuesta3 = Integer.parseInt(txtRespuesta3.getText());
            int respuesta4 = Integer.parseInt(txtRespuesta4.getText());
            int respuesta5 = Integer.parseInt(txtRespuesta5.getText());

            double huellaCarbono = calcularHuellaCarbono(respuesta2, respuesta3, respuesta4, respuesta5);

            // Construir el mensaje que incluye los datos del usuario y la huella de carbono
            String mensaje = "Usuario:\nNombre: " + nombre + "\nCédula: " + cedula + "\nLugar de procedencia: "
                    + procedencia
                    + "\n\nLa huella de carbono calculada es: " + huellaCarbono + "\n\n¿Qué deseas hacer?";
            Object[] opciones = { "Consejos", "Aceptar", "Cerrar" };
            int seleccion = JOptionPane.showOptionDialog(null, mensaje, "Resultado",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    Consejos consejos = new Consejos();
                    consejos.mostrarVentana();
                    break;
                case 1:
                    break;
                case 2:
                    ventanaCalculadora.dispose();
                    break;
                default:
                    break;
            }
        });

        JButton btnRegresar = new JButton("Regresar");
        btnRegresar.setPreferredSize(new Dimension(30, 30));
        btnRegresar.addActionListener(e -> {
            Bienvenida bienvenida = new Bienvenida();
            bienvenida.main(null);
            ventanaCalculadora.dispose();
        });

        panelPrincipal.add(panelPreguntas);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelPrincipal.add(btnCalcular, gbc);

        gbc.gridx++;
        panelPrincipal.add(btnRegresar, gbc);

        ventanaCalculadora.add(panelPrincipal);
        ventanaCalculadora.setLocationRelativeTo(null);
        ventanaCalculadora.setVisible(true);
    }

    private double calcularHuellaCarbono(int respuesta2, int respuesta3, int respuesta4, int respuesta5) {
        double huellaCarbono = (respuesta2 * 0.1) + (respuesta3 * 0.05) + (respuesta4 * 0.5) + respuesta5;
        return huellaCarbono;
    }

    public static void main(String[] args) {
        
    }

    private static ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }
}

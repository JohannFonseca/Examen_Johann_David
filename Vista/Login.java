package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        // Crear la ventana de login
        JFrame ventanaLogin = new JFrame("Login");
        ventanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaLogin.setSize(400, 300); // Tamaño de la ventana
        ventanaLogin.setLayout(null); // Usar layout nulo para posición manual


         // Crear el JLabel para el título "Login"
         JLabel labelLogin = new JLabel("Login");
         labelLogin.setFont(new Font("Times New Roman", Font.BOLD, 24));
         labelLogin.setBounds(167, 16, 100, 40); // Posición y tamaño (x, y, width, height)
  

        // Crear los componentes del formulario
        JLabel labelUsuario = new JLabel("Usuario:");
        labelUsuario.setBounds(50, 80, 100, 30); // Posición y tamaño (x, y, width, height)

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(150, 80, 200, 30);

        JLabel labelContraseña = new JLabel("Contraseña:");
        labelContraseña.setBounds(50, 130, 100, 30);

        JPasswordField campoContraseña = new JPasswordField();
        campoContraseña.setBounds(150, 130, 200, 30);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(150, 180, 100, 30);

        // Agregar los componentes a la ventana
        ventanaLogin.add(labelUsuario);
        ventanaLogin.add(campoUsuario);
        ventanaLogin.add(labelContraseña);
        ventanaLogin.add(campoContraseña);
        ventanaLogin.add(btnAceptar);
        ventanaLogin.add(labelLogin);

        // Centrar la ventana en la pantalla
        ventanaLogin.setLocationRelativeTo(null);

        // Hacer visible la ventana
        ventanaLogin.setVisible(true);

        // Agregar acción al botón Aceptar
    /*     btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String contrasena = new String(campoContraseña.getPassword());

                // Verificar credenciales
                if () {
                    // Cerrar la ventana de login
                    ventanaLogin.dispose();

                    // Abrir la ventana de bienvenida
                    Bienvenida.mostrarVentana();
                } else {
                    JOptionPane.showMessageDialog(ventanaLogin, "Usuario o contraseña incorrectos, vuelva a intentarlo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }); */
    }
}

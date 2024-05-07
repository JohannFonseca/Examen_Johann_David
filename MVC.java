public class MVC {
    private JTextField txtConsumoEnergia;
    private JTextField txtKilometrosCoche;
    private JTextField txtKilometrosBus;
    private JTextField txtConsumoCarne;
    private JTextField txtConsumoProductos;
    private JButton btnCalcular;
    private JLabel lblResultado;

    public MVC() {
        setTitle("Calculadora de Huella de Carbono");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes de la interfaz gráfica
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        panel.add(new JLabel("Consumo de energía (kWh/mes):"));
        txtConsumoEnergia = new JTextField();
        panel.add(txtConsumoEnergia);

        panel.add(new JLabel("Kilómetros en coche (km/año):"));
        txtKilometrosCoche = new JTextField();
        panel.add(txtKilometrosCoche);

        panel.add(new JLabel("Kilómetros en bus (km/año):"));
        txtKilometrosBus = new JTextField();
        panel.add(txtKilometrosBus);

        panel.add(new JLabel("Consumo de carne (kg/semana):"));
        txtConsumoCarne = new JTextField();
        panel.add(txtConsumoCarne);

        panel.add(new JLabel("Consumo de productos empaquetados (número/semana):"));
        txtConsumoProductos = new JTextField();
        panel.add(txtConsumoProductos);

        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(this);
        panel.add(btnCalcular);

        lblResultado = new JLabel();
        panel.add(lblResultado);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                double consumoEnergia = Double.parseDouble(txtConsumoEnergia.getText());
                double kilometrosCoche = Double.parseDouble(txtKilometrosCoche.getText());
                double kilometrosBus = Double.parseDouble(txtKilometrosBus.getText());
                double consumoCarne = Double.parseDouble(txtConsumoCarne.getText());
                double consumoProductos = Double.parseDouble(txtConsumoProductos.getText());

                double huellaCarbono = calcularHuellaCarbono(consumoEnergia, kilometrosCoche, kilometrosBus,
                                                             consumoCarne, consumoProductos);
                lblResultado.setText("Tu huella de carbono es: " + huellaCarbono + " toneladas de CO2 por año.");
            } catch (NumberFormatException ex) {
                lblResultado.setText("Por favor, introduce números válidos en todos los campos.");
            }
        }
    }

    private double calcularHuellaCarbono(double consumoEnergia, double kilometrosCoche, double kilometrosBus,
                                          double consumoCarne, double consumoProductos) {
        double huellaCarbono = (consumoEnergia * 0.5) + (kilometrosCoche * 0.1) + (kilometrosBus * 0.05) +
                               (consumoCarne * 2) + (consumoProductos * 0.5);
        return huellaCarbono;
    }

    public void mostrarVista() {
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MVC vista = new MVC();
            vista.mostrarVista();
        });
    }
}

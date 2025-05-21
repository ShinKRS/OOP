package fisica;

import javax.swing.*;

public class CaidaLibreGUI extends JFrame {
    public CaidaLibreGUI() {
        setTitle("Caída Libre");
        setSize(350, 250);
        setLayout(null);

        // Etiquetas y campos de texto
        JLabel lblT = new JLabel("Tiempo (s):");
        JLabel lblVf = new JLabel("Velocidad Final (m/s):");
        JLabel lblH = new JLabel("Altura (m):");
        JTextField txtT = new JTextField();
        JTextField txtVf = new JTextField();
        JTextField txtH = new JTextField();
        JButton btnCalcular = new JButton("Calcular");

        // Combobox para seleccionar qué calcular
        String[] opciones = {"Altura", "Velocidad Final", "Tiempo"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        comboBox.setBounds(10, 10, 150, 25);

        lblT.setBounds(10, 50, 120, 25);
        txtT.setBounds(140, 50, 100, 25);
        lblVf.setBounds(10, 80, 120, 25);
        txtVf.setBounds(140, 80, 100, 25);
        lblH.setBounds(10, 110, 120, 25);
        txtH.setBounds(140, 110, 100, 25);
        btnCalcular.setBounds(90, 150, 100, 30);

        // Agregar elementos a la ventana
        add(comboBox);
        add(lblT);
        add(txtT);
        add(lblVf);
        add(txtVf);
        add(lblH);
        add(txtH);
        add(btnCalcular);

        // Configurar la visibilidad de los campos según la opción seleccionada
        comboBox.addActionListener(e -> {
            String opcion = (String) comboBox.getSelectedItem();

            // Para Altura
            if ("Altura".equals(opcion)) {
                lblT.setVisible(true);
                txtT.setVisible(true);
                lblVf.setVisible(true);
                txtVf.setVisible(true);
                lblH.setVisible(false);
                txtH.setVisible(false);
            }

            // Para Velocidad Final
            if ("Velocidad Final".equals(opcion)) {
                lblT.setVisible(true);
                txtT.setVisible(true);
                lblH.setVisible(true);
                txtH.setVisible(true);
                lblVf.setVisible(false);
                txtVf.setVisible(false);
            }

            // Para Tiempo
            if ("Tiempo".equals(opcion)) {
                lblVf.setVisible(true);
                txtVf.setVisible(true);
                lblH.setVisible(true);
                txtH.setVisible(true);
                lblT.setVisible(false);
                txtT.setVisible(false);
            }
        });

        // Acción del botón Calcular
        btnCalcular.addActionListener(e -> {
            try {
                String opcion = (String) comboBox.getSelectedItem();
                double g = 9.8;
                double resultado;

                // Calcular Altura
                if ("Altura".equals(opcion)) {
                    double t = Double.parseDouble(txtT.getText());
                    resultado = 0.5 * g * t * t;
                    JOptionPane.showMessageDialog(this, "Altura = " + resultado + " m");
                }

                // Calcular Velocidad Final
                if ("Velocidad Final".equals(opcion)) {
                    double t = Double.parseDouble(txtT.getText());
                    resultado = g * t;
                    JOptionPane.showMessageDialog(this, "Velocidad Final = " + resultado + " m/s");
                }

                // Calcular Tiempo
                if ("Tiempo".equals(opcion)) {
                    double h = Double.parseDouble(txtH.getText());
                    resultado = Math.sqrt((2 * h) / g);
                    JOptionPane.showMessageDialog(this, "Tiempo = " + resultado + " s");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en los datos.");
            }
        });

        setVisible(true);
    }
}

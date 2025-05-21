package fisica;

import javax.swing.*;

public class MovimientoUniformeGUI extends JFrame {
    public MovimientoUniformeGUI() {
        setTitle("Movimiento Uniforme");
        setSize(350, 250);
        setLayout(null);

        // Etiquetas y campos de texto
        JLabel lblVel = new JLabel("Velocidad (m/s):");
        JLabel lblTiempo = new JLabel("Tiempo (s):");
        JLabel lblDistancia = new JLabel("Distancia (m):");
        JTextField txtVel = new JTextField();
        JTextField txtTiempo = new JTextField();
        JTextField txtDistancia = new JTextField();
        JButton btnCalcular = new JButton("Calcular");

        // Combobox para seleccionar qué calcular
        String[] opciones = {"Distancia", "Tiempo", "Velocidad"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        comboBox.setBounds(10, 10, 120, 25);

        lblVel.setBounds(10, 50, 120, 25);
        txtVel.setBounds(140, 50, 100, 25);
        lblTiempo.setBounds(10, 80, 120, 25);
        txtTiempo.setBounds(140, 80, 100, 25);
        lblDistancia.setBounds(10, 110, 120, 25);
        txtDistancia.setBounds(140, 110, 100, 25);
        btnCalcular.setBounds(90, 150, 100, 30);

        // Agregar elementos a la ventana
        add(comboBox);
        add(lblVel);
        add(txtVel);
        add(lblTiempo);
        add(txtTiempo);
        add(lblDistancia);
        add(txtDistancia);
        add(btnCalcular);

        // Configurar la visibilidad de los campos según la opción seleccionada
        comboBox.addActionListener(e -> {
            String opcion = (String) comboBox.getSelectedItem();

            // Para Distancia
            if ("Distancia".equals(opcion)) {
                lblVel.setVisible(true);
                txtVel.setVisible(true);
                lblTiempo.setVisible(true);
                txtTiempo.setVisible(true);
                lblDistancia.setVisible(false);
                txtDistancia.setVisible(false);
            }

            // Para Tiempo
            if ("Tiempo".equals(opcion)) {
                lblVel.setVisible(true);
                txtVel.setVisible(true);
                lblDistancia.setVisible(true);
                txtDistancia.setVisible(true);
                lblTiempo.setVisible(false);
                txtTiempo.setVisible(false);
            }

            // Para Velocidad
            if ("Velocidad".equals(opcion)) {
                lblTiempo.setVisible(true);
                txtTiempo.setVisible(true);
                lblDistancia.setVisible(true);
                txtDistancia.setVisible(true);
                lblVel.setVisible(false);
                txtVel.setVisible(false);
            }
        });

        // Acción del botón Calcular
        btnCalcular.addActionListener(e -> {
            try {
                String opcion = (String) comboBox.getSelectedItem();
                double resultado;
                
                // Calcular Distancia
                if ("Distancia".equals(opcion)) {
                    double v = Double.parseDouble(txtVel.getText());
                    double t = Double.parseDouble(txtTiempo.getText());
                    resultado = v * t;
                    JOptionPane.showMessageDialog(this, "Distancia = " + resultado + " m");
                }

                // Calcular Tiempo
                if ("Tiempo".equals(opcion)) {
                    double d = Double.parseDouble(txtDistancia.getText());
                    double v = Double.parseDouble(txtVel.getText());
                    resultado = d / v;
                    JOptionPane.showMessageDialog(this, "Tiempo = " + resultado + " s");
                }

                // Calcular Velocidad
                if ("Velocidad".equals(opcion)) {
                    double d = Double.parseDouble(txtDistancia.getText());
                    double t = Double.parseDouble(txtTiempo.getText());
                    resultado = d / t;
                    JOptionPane.showMessageDialog(this, "Velocidad = " + resultado + " m/s");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en los datos.");
            }
        });

        setVisible(true);
    }
}

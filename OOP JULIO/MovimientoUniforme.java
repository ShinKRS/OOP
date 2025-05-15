package fisica;

import javax.swing.*;

public class MovimientoUniformeGUI extends JFrame {
    public MovimientoUniformeGUI() {
        setTitle("Movimiento Uniforme");
        setSize(300, 200);
        setLayout(null);

        JLabel lblVel = new JLabel("Velocidad (m/s):");
        JLabel lblTiempo = new JLabel("Tiempo (s):");
        JTextField txtVel = new JTextField();
        JTextField txtTiempo = new JTextField();
        JButton btnCalcular = new JButton("Calcular");

        lblVel.setBounds(10, 10, 120, 25);
        txtVel.setBounds(140, 10, 100, 25);
        lblTiempo.setBounds(10, 40, 120, 25);
        txtTiempo.setBounds(140, 40, 100, 25);
        btnCalcular.setBounds(90, 80, 100, 30);

        add(lblVel);
        add(txtVel);
        add(lblTiempo);
        add(txtTiempo);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> {
            try {
                double v = Double.parseDouble(txtVel.getText());
                double t = Double.parseDouble(txtTiempo.getText());
                double d = v * t;
                JOptionPane.showMessageDialog(this, "Distancia = " + d + " m");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en los datos.");
            }
        });

        setVisible(true);
    }
}

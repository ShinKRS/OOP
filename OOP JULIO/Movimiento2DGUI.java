package fisica;

import javax.swing.*;

public class Movimiento2DGUI extends JFrame {
    public Movimiento2DGUI() {
        setTitle("Movimiento en 2D");
        setSize(350, 250);
        setLayout(null);

        JLabel lblV0 = new JLabel("Velocidad inicial (m/s):");
        JTextField txtV0 = new JTextField();
        JLabel lblAng = new JLabel("Ángulo (°):");
        JTextField txtAng = new JTextField();
        JButton btnCalcular = new JButton("Calcular");

        lblV0.setBounds(10, 10, 160, 25);
        txtV0.setBounds(180, 10, 100, 25);
        lblAng.setBounds(10, 50, 160, 25);
        txtAng.setBounds(180, 50, 100, 25);
        btnCalcular.setBounds(110, 100, 120, 30);

        add(lblV0); add(txtV0);
        add(lblAng); add(txtAng);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> {
            try {
                double v0 = Double.parseDouble(txtV0.getText());
                double ang = Math.toRadians(Double.parseDouble(txtAng.getText()));
                double g = 9.8;
                double vy = v0 * Math.sin(ang);
                double vx = v0 * Math.cos(ang);
                double t = 2 * vy / g;
                double h = vy * vy / (2 * g);
                double alcance = vx * t;

                JOptionPane.showMessageDialog(this,
                    "Tiempo vuelo: " + t + " s\nAltura máx: " + h + " m\nAlcance: " + alcance + " m");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en los datos.");
            }
        });

        setVisible(true);
    }
}

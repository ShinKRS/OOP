package fisica;

import javax.swing.*;

public class CaidaLibreGUI extends JFrame {
    public CaidaLibreGUI() {
        setTitle("Caída Libre");
        setSize(300, 200);
        setLayout(null);

        JLabel lblT = new JLabel("Tiempo (s):");
        JTextField txtT = new JTextField();
        JButton btnCalcular = new JButton("Calcular");

        lblT.setBounds(10, 10, 120, 25);
        txtT.setBounds(140, 10, 100, 25);
        btnCalcular.setBounds(90, 60, 100, 30);

        add(lblT);
        add(txtT);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> {
            try {
                double g = 9.8;
                double t = Double.parseDouble(txtT.getText());
                double h = 0.5 * g * t * t;
                double vf = g * t;
                JOptionPane.showMessageDialog(this, "Altura = " + h + " m\nVf = " + vf + " m/s");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en los datos.");
            }
        });

        setVisible(true);
    }
}

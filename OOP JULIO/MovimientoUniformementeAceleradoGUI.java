package fisica;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MovimientoUniformementeAceleradoGUI extends JFrame {
    public MovimientoUniformementeAceleradoGUI() {
        setTitle("MUA");
        setSize(300, 250);
        setLayout(null);

        JLabel lblVi = new JLabel("Velocidad inicial (m/s):");
        JLabel lblA = new JLabel("Aceleración (m/s²):");
        JLabel lblT = new JLabel("Tiempo (s):");
        JTextField txtVi = new JTextField();
        JTextField txtA = new JTextField();
        JTextField txtT = new JTextField();
        JButton btnCalcular = new JButton("Calcular");

        lblVi.setBounds(10, 10, 150, 25);
        txtVi.setBounds(160, 10, 100, 25);
        lblA.setBounds(10, 50, 150, 25);
        txtA.setBounds(160, 50, 100, 25);
        lblT.setBounds(10, 90, 150, 25);
        txtT.setBounds(160, 90, 100, 25);
        btnCalcular.setBounds(90, 130, 100, 30);

        add(lblVi); add(txtVi);
        add(lblA); add(txtA);
        add(lblT); add(txtT);
        add(btnCalcular);

        btnCalcular.addActionListener((ActionEvent e) -> {
            try {
                double vi = Double.parseDouble(txtVi.getText());
                double a = Double.parseDouble(txtA.getText());
                double t = Double.parseDouble(txtT.getText());
                double vf = vi + a * t;
                double d = vi * t + 0.5 * a * t * t;
                JOptionPane.showMessageDialog(this, "Vf = " + vf + " m/s\nDistancia = " + d + " m");
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error en los datos.");
            }
        });

        setVisible(true);
    }
}

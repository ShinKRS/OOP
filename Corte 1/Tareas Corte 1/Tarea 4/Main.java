import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField txtNumber1, txtNumber2, txtResult;
    private JButton btnSumar, btnRestar, btnMultiplicar;
    private Operations operations;

    public Main() {
        operations = new Operations();
        createUI();
    }

    private void createUI() {
        setTitle("Operaciones Matemáticas");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Componentes
        panel.add(new JLabel("Número 1:"));
        txtNumber1 = new JTextField();
        panel.add(txtNumber1);

        panel.add(new JLabel("Número 2:"));
        txtNumber2 = new JTextField();
        panel.add(txtNumber2);

        panel.add(new JLabel("Resultado:"));
        txtResult = new JTextField();
        txtResult.setEditable(false);
        panel.add(txtResult);

        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");
        btnMultiplicar = new JButton("Multiplicar");

        panel.add(btnSumar);
        panel.add(btnRestar);
        panel.add(btnMultiplicar);

        add(panel);

        // Eventos botones
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setNumbers()) {
                    double resultado = operations.sumar();
                    txtResult.setText(String.valueOf(resultado));
                }
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setNumbers()) {
                    double resultado = operations.restar();
                    txtResult.setText(String.valueOf(resultado));
                }
            }
        });

        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setNumbers()) {
                    double resultado = operations.multiplicar();
                    txtResult.setText(String.valueOf(resultado));
                }
            }
        });
    }

    // Método para validar y asignar números
    private boolean setNumbers() {
        try {
            double num1 = Double.parseDouble(txtNumber1.getText());
            double num2 = Double.parseDouble(txtNumber2.getText());
            operations.setNumber1(num1);
            operations.setNumber2(num2);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main mainWindow = new Main();
            mainWindow.setVisible(true);
        });
    }
}

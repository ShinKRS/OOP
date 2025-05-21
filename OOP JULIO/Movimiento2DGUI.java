package fisica;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Movimiento2DGUI extends JFrame {

    private static final double GRAVEDAD = 9.8;
    private final DecimalFormat df = new DecimalFormat("#0.00");

    public Movimiento2DGUI() {
        super("Simulador de Movimiento Parabólico");
        inicializarComponentes();
        configurarVentana();
    }

    private void inicializarComponentes() {
        // Configuración de la ventana
        setSize(400, 350);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Componentes de entrada
        JLabel lblV0 = crearEtiqueta("Velocidad inicial (m/s):", 20);
        JTextField txtV0 = crearCampoTexto(200, 20);
        
        JLabel lblAng = crearEtiqueta("Ángulo de lanzamiento (°):", 60);
        JTextField txtAng = crearCampoTexto(200, 60);
        
        // Botones
        JButton btnCalcular = crearBoton("Calcular", 50, 120, e -> calcularMovimiento(txtV0, txtAng));
        JButton btnLimpiar = crearBoton("Limpiar", 200, 120, e -> limpiarCampos(txtV0, txtAng));
        
        // Área de resultados
        JTextArea areaResultados = new JTextArea();
        areaResultados.setBounds(50, 170, 300, 100);
        areaResultados.setEditable(false);
        areaResultados.setBorder(BorderFactory.createTitledBorder("Resultados"));

        // Agregar componentes
        add(lblV0); add(txtV0);
        add(lblAng); add(txtAng);
        add(btnCalcular); add(btnLimpiar);
        add(areaResultados);
    }

    private void configurarVentana() {
        setLocationRelativeTo(null); // Centrar la ventana
        setVisible(true);
    }

    private JLabel crearEtiqueta(String texto, int y) {
        JLabel label = new JLabel(texto);
        label.setBounds(30, y, 160, 25);
        return label;
    }

    private JTextField crearCampoTexto(int x, int y) {
        JTextField campo = new JTextField();
        campo.setBounds(x, y, 150, 25);
        return campo;
    }

    private JButton crearBoton(String texto, int x, int y, java.awt.event.ActionListener listener) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, 120, 30);
        boton.addActionListener(listener);
        return boton;
    }

    private void calcularMovimiento(JTextField txtV0, JTextField txtAng) {
        try {
            double v0 = Double.parseDouble(txtV0.getText());
            double angulo = Math.toRadians(Double.parseDouble(txtAng.getText()));
            
            if (v0 <= 0) {
                throw new IllegalArgumentException("La velocidad debe ser positiva");
            }
            
            if (Double.parseDouble(txtAng.getText()) <= 0 || Double.parseDouble(txtAng.getText()) >= 90) {
                throw new IllegalArgumentException("El ángulo debe estar entre 0° y 90°");
            }

            // Cálculos
            double vx = v0 * Math.cos(angulo);
            double vy = v0 * Math.sin(angulo);
            double tiempoVuelo = 2 * vy / GRAVEDAD;
            double alturaMaxima = (vy * vy) / (2 * GRAVEDAD);
            double alcance = vx * tiempoVuelo;

            // Mostrar resultados
            String resultados = "Componente horizontal (Vx): " + df.format(vx) + " m/s\n" +
                              "Componente vertical (Vy): " + df.format(vy) + " m/s\n" +
                              "Tiempo de vuelo: " + df.format(tiempoVuelo) + " s\n" +
                              "Altura máxima: " + df.format(alturaMaxima) + " m\n" +
                              "Alcance horizontal: " + df.format(alcance) + " m";

            JOptionPane.showMessageDialog(this, resultados, "Resultados", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores numéricos válidos.", 
                                        "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), 
                                        "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos(JTextField... campos) {
        for (JTextField campo : campos) {
            campo.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Movimiento2DGUI());
    }
}

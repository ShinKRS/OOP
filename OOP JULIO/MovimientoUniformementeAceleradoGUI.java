package fisica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MovimientoUniformementeAceleradoGUI extends JFrame {

    private final JTextField txtVi, txtVf, txtA, txtT, txtD;

    public MovimientoUniformementeAceleradoGUI() {
        super("Calculadora de Movimiento Uniformemente Acelerado");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        // Inicializar componentes
        JLabel lblVi = crearEtiqueta("Velocidad inicial (Vi) m/s:", 10);
        JLabel lblVf = crearEtiqueta("Velocidad final (Vf) m/s:", 50);
        JLabel lblA = crearEtiqueta("Aceleración (a) m/s²:", 90);
        JLabel lblT = crearEtiqueta("Tiempo (t) s:", 130);
        JLabel lblD = crearEtiqueta("Distancia (d) m:", 170);

        txtVi = crearCampoTexto(160, 10);
        txtVf = crearCampoTexto(160, 50);
        txtA = crearCampoTexto(160, 90);
        txtT = crearCampoTexto(160, 130);
        txtD = crearCampoTexto(160, 170);

        JButton btnCalcular = crearBoton("Calcular", 80, 220, e -> calcularMUA());
        JButton btnLimpiar = crearBoton("Limpiar", 200, 220, e -> limpiarCampos());

        // Agregar componentes al frame
        agregarComponentes(lblVi, txtVi, lblVf, txtVf, lblA, txtA, 
                         lblT, txtT, lblD, txtD, btnCalcular, btnLimpiar);

        setVisible(true);
    }

    // Métodos auxiliares para creación de componentes
    private JLabel crearEtiqueta(String texto, int y) {
        JLabel label = new JLabel(texto);
        label.setBounds(10, y, 150, 25);
        return label;
    }

    private JTextField crearCampoTexto(int x, int y) {
        JTextField campo = new JTextField();
        campo.setBounds(x, y, 100, 25);
        return campo;
    }

    private JButton crearBoton(String texto, int x, int y, java.awt.event.ActionListener listener) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, 100, 30);
        boton.addActionListener(listener);
        return boton;
    }

    private void agregarComponentes(Component... componentes) {
        for (Component componente : componentes) {
            add(componente);
        }
    }

    // Lógica de cálculo
    private void calcularMUA() {
        try {
            double vi = obtenerValor(txtVi);
            double vf = obtenerValor(txtVf);
            double a = obtenerValor(txtA);
            double t = obtenerValor(txtT);
            double d = obtenerValor(txtD);

            int camposVacios = contarCamposVacios(vi, vf, a, t, d);

            if (camposVacios != 1) {
                mostrarMensaje(camposVacios == 0 ? 
                    "Todos los campos están llenos." : 
                    "Debe dejar exactamente un campo vacío para calcular.", 
                    "Información", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            if (Double.isNaN(vi)) {
                calcularVelocidadInicial(vf, a, t, d);
            } else if (Double.isNaN(vf)) {
                calcularVelocidadFinal(vi, a, t);
            } else if (Double.isNaN(a)) {
                calcularAceleracion(vi, vf, t, d);
            } else if (Double.isNaN(t)) {
                calcularTiempo(vi, vf, a);
            } else if (Double.isNaN(d)) {
                calcularDistancia(vi, a, t);
            }

        } catch (NumberFormatException ex) {
            mostrarMensaje("Por favor ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double obtenerValor(JTextField campo) {
        return campo.getText().trim().isEmpty() ? Double.NaN : Double.parseDouble(campo.getText().trim());
    }

    private int contarCamposVacios(double... campos) {
        int vacios = 0;
        for (double campo : campos) {
            if (Double.isNaN(campo)) vacios++;
        }
        return vacios;
    }

    // Métodos de cálculo específicos
    private void calcularVelocidadInicial(double vf, double a, double t, double d) {
        if (!Double.isNaN(vf) && !Double.isNaN(a) && !Double.isNaN(t)) {
            txtVi.setText(formatearResultado(vf - a * t));
        } else if (!Double.isNaN(d) && !Double.isNaN(a) && !Double.isNaN(t)) {
            txtVi.setText(formatearResultado((d - 0.5 * a * t * t) / t));
        } else if (!Double.isNaN(vf) && !Double.isNaN(d) && !Double.isNaN(t)) {
            txtVi.setText(formatearResultado((2 * d - vf * t) / t));
        } else {
            mostrarMensaje("No hay suficientes datos para calcular Vi.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularVelocidadFinal(double vi, double a, double t) {
        txtVf.setText(formatearResultado(vi + a * t));
    }

    private void calcularAceleracion(double vi, double vf, double t, double d) {
        if (!Double.isNaN(t)) {
            txtA.setText(formatearResultado((vf - vi) / t));
        } else if (!Double.isNaN(d)) {
            txtA.setText(formatearResultado((vf * vf - vi * vi) / (2 * d)));
        } else {
            mostrarMensaje("No hay suficientes datos para calcular la aceleración.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularTiempo(double vi, double vf, double a) {
        txtT.setText(formatearResultado((vf - vi) / a));
    }

    private void calcularDistancia(double vi, double a, double t) {
        txtD.setText(formatearResultado(vi * t + 0.5 * a * t * t));
    }

    private String formatearResultado(double valor) {
        return String.format("%.4f", valor);
    }

    private void limpiarCampos() {
        txtVi.setText("");
        txtVf.setText("");
        txtA.setText("");
        txtT.setText("");
        txtD.setText("");
    }

    private void mostrarMensaje(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, tipo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MovimientoUniformementeAceleradoGUI());
    }
}

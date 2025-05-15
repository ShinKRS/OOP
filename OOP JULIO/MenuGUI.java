package fisica;

import javax.swing.*;

public class MenuGUI extends JFrame {
    public MenuGUI() {
        setTitle("Calculadora de Movimientos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(null);

        JButton btnMU = new JButton("Movimiento Uniforme");
        btnMU.setBounds(100, 20, 200, 30);
        add(btnMU);

        JButton btnMUA = new JButton("Movimiento Uniformemente Acelerado");
        btnMUA.setBounds(100, 60, 200, 30);
        add(btnMUA);

        JButton btnCaida = new JButton("Caída Libre");
        btnCaida.setBounds(100, 100, 200, 30);
        add(btnCaida);

        JButton btn2D = new JButton("Movimiento en 2D");
        btn2D.setBounds(100, 140, 200, 30);
        add(btn2D);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(100, 180, 200, 30);
        add(btnSalir);

        btnMU.addActionListener(e -> new MovimientoUniformeGUI());
        btnMUA.addActionListener(e -> new MovimientoUniformementeAceleradoGUI());
        btnCaida.addActionListener(e -> new CaidaLibreGUI());
        btn2D.addActionListener(e -> new Movimiento2DGUI());
        btnSalir.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}

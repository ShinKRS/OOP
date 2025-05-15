mport fisica.CaidaLibreGUI;
import fisica.Movimiento2DGUI;
import fisica.MovimientoUniformementeAceleradoGUI;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Movimientos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JButton btnMU = new JButton("Movimiento Uniforme");
        JButton btnMUA = new JButton("MUA");
        JButton btnCaida = new JButton("Caída Libre");
        JButton btn2D = new JButton("Movimiento 2D");
        JButton btnSalir = new JButton("Salir");

        btnMU.setBounds(100, 20, 200, 30);
        btnMUA.setBounds(100, 60, 200, 30);
        btnCaida.setBounds(100, 100, 200, 30);
        btn2D.setBounds(100, 140, 200, 30);
        btnSalir.setBounds(100, 180, 200, 30);

        frame.add(btnMU);
        frame.add(btnMUA);
        frame.add(btnCaida);
        frame.add(btn2D);
        frame.add(btnSalir);

        btnMU.addActionListener(e -> new MovimientoUniformeGUI());
        btnMUA.addActionListener(e -> new MovimientoUniformementeAceleradoGUI());
        btnCaida.addActionListener(e -> new CaidaLibreGUI());
        btn2D.addActionListener(e -> new Movimiento2DGUI());
        btnSalir.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
        
    
    }
    }

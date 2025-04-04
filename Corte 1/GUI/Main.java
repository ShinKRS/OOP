package calculadoraops;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        Ops operadores = new Ops();

        String num1 = JOptionPane.showInputDialog("Ingrese el primer número");
        String num2 = JOptionPane.showInputDialog("Ingrese el segundo número");

        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);

        String opcion = JOptionPane.showInputDialog(
            "Digite qué operación requiere:\n1. Suma\n2. Resta\n3. Multiplicación\n4. Potencia"
        );

        int Opcion = Integer.parseInt(opcion);

        switch (Opcion) {
            case 1 -> JOptionPane.showMessageDialog(null, "La suma es: " + operadores.sumar(numero1, numero2));
            case 2 -> JOptionPane.showMessageDialog(null, "La resta es: " + operadores.restar(numero1, numero2));
            case 3 -> JOptionPane.showMessageDialog(null, "La multiplicación es: " + operadores.multiplicar(numero1, numero2));
            case 4 -> JOptionPane.showMessageDialog(null, "La potencia es: " + operadores.potencia(numero1, numero2));
            default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }
}

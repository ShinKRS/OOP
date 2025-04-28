package operations;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Operations resultado = new Operations();

        String num1 = JOptionPane.showInputDialog("Ingrese el primer numero: ");
        String num2 = JOptionPane.showInputDialog("Ingrese el segundo numero: ");
        
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        
        String opcion = JOptionPane.showInputDialog("Digite qué operacion desea realizar: \n1.Suma\n2.Resta\n3.Multiplicacion\n4.Potencia");
        
        int Opcion = Integer.parseInt(opcion);
        
         switch (Opcion) {
             
            
            case 1 ->{ 
            resultado.setSuma(numero1,numero2);
            JOptionPane.showMessageDialog(null, resultado.getResultado(numero1, numero2));
            }
            
        
             case 2 ->{
             resultado.setResta(numero1,numero2);
             JOptionPane.showMessageDialog(null, resultado.getResultado(numero1, numero2));
            }
             
            case 3 -> {
                resultado.setMultiplicacion(numero1,numero2);
                JOptionPane.showMessageDialog(null, resultado.getResultado(numero1, numero2));
            }
            
            case 4 -> {
            resultado.setPotencia(numero1,numero2);
            JOptionPane.showMessageDialog(null, resultado.getResultado(numero1, numero2));
            }
            default -> JOptionPane.showMessageDialog(null, "Opción inválida."); 
       }
    }
}

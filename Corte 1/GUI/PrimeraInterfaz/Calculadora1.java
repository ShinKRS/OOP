package ops;

import javax.swing.JOptionPane;

public class Ops {

        // Métodos para operaciones matemáticas
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;   
    }

    public int multiplicar(int a, int b) {
        return a * b;   
    }
    public int potencia (int base, int exponente){
        
        return exponente == 0 ? 1: base*potencia(base,exponente-1);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String opcion;
//////////////
        Ops operadores = new Ops(); // Crear objeto
                //Obtener los valores digitados por el usuario mediante cuadro de dialogos
                String num1 =
                        JOptionPane.showInputDialog ("Ingrese el primer numero");
                String num2 = 
                        JOptionPane.showInputDialog("Ingrese el segudo numero");


                //Convertir String a Integer
                int numero1 = Integer.parseInt(num1);
                int numero2 = Integer.parseInt (num2);

                    //Permitir al usuario elegir la operacion matematica de su elección
                     opcion = JOptionPane.showInputDialog("Digite que operacion requiere(1.Suma,2. Restar, 3. Multiplicación, 4. Potencia)");
                    
                     //Cambiar de String a Int para efectuar la operación seleccionada
                    int Opcion = Integer.parseInt(opcion);


                    //Una estructura de control Switch Case para permitir las opciones del usuario
                    switch (Opcion) {

                        case 1 -> JOptionPane.showMessageDialog(null,"La suma es: " + operadores.sumar(numero1, numero2));

                        case 2 -> JOptionPane.showMessageDialog(null,"La resta es: " + operadores.restar(numero1, numero2));

                        case 3 -> JOptionPane.showMessageDialog(null,"La multiplicacion es: " + operadores.multiplicar(numero1, numero2));

                        case 4 -> JOptionPane.showMessageDialog(null,"La potencia es: " + operadores.potencia(numero1, numero2));

                }
            }
}

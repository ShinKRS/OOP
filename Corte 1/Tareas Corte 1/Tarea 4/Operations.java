public class Operations {
    private double number1;
    private double number2;

    // Constructor vacío
    public Operations() {}

    // Constructor con parámetros
    public Operations(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    
    // Getters y Setters
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
    // Métodos para operaciones
    public double sumar() {
        return number1 + number2;
    }

    public double restar() {
        return number1 - number2;
    }

    public double multiplicar() {
        return number1 * number2;
    }

}

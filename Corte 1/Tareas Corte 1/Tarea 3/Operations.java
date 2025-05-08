package operations;

public class Operations {
    private int result;

    // Getter del resultado
    public String getResultado(int numero1, int numero2) {
    String mensaje = "Result = " + result;
    return mensaje; // Sin JOptionPane aquí
}

    // Setters personalizados para operaciones
    public int setSuma(int a, int b) {
        result = a+b;
        return result;
    }

    public void setResta(int a, int b) {
        result = a - b;
        
    }

    public void setMultiplicacion(int a, int b) {
        result = a * b;

    }

    public void setPotencia(int base, int exponente) {
        result = calcularPotencia(base, exponente);
        
    }

    // Método auxiliar para la potencia
    private int calcularPotencia(int base, int exponente) {
        result = exponente == 0 ? 1 : base * calcularPotencia(base, exponente - 1);
        return result;
    }
}

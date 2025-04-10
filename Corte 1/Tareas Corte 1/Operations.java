public class Operations {
    private int r;

    // Getter del resultado
    public int getResultado() {
        return r;
    }

    // Setters personalizados para operaciones
    public void setSuma(int a, int b) {
        r = a + b;
    }

    public void setResta(int a, int b) {
        r = a - b;
    }

    public void setMultiplicacion(int a, int b) {
        r = a * b;
    }

    public void setPotencia(int base, int exponente) {
        r = calcularPotencia(base, exponente);
    }

    // Método auxiliar para la potencia
    private int calcularPotencia(int base, int exponente) {
        return exponente == 0 ? 1 : base * calcularPotencia(base, exponente - 1);
    }
}

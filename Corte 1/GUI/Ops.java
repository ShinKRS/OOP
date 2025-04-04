package calculadoraops;

public class Ops {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int potencia(int base, int exponente) {
        return exponente == 0 ? 1 : base * potencia(base, exponente - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Operations resultado = new Operations();

        resultado.setSuma(3, 2);
        System.out.println("Suma: " + resultado.getResultado());

        resultado.setResta(9, 6);
        System.out.println("Resta: " + resultado.getResultado());

        resultado.setMultiplicacion(2, 5);
        System.out.println("Multiplicación: " + resultado.getResultado());

        resultado.setPotencia(2, 3);
        System.out.println("Potencia: " + resultado.getResultado());
    }
}

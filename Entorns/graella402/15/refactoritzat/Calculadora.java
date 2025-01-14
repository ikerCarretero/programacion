public class Calculadora {
    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public int multiplicacio(int a, int b) {
        return a * b;
    }

    public int divisio(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No es pot dividir per zero");
        }
        return a / b;
    }
}

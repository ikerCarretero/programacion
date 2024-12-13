public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultatSuma = calculadora.suma(5.5, 4.2);
        System.out.println("Resultat de la suma: " + resultatSuma);

        double resultatDivisio = calculadora.divisio(10.0, 3.0);
        System.out.println("Resultat de la divisió: " + resultatDivisio);
    }
}
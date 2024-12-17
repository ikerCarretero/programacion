public class Banc {

    public double calculaInteres(double capital, double tipusInteres, int anys) {
        return capital * tipusInteres * anys / 100;
    }

    public void mostrarInteres() {
        double interes = calculaInteres(1000, 5, 2);
        System.out.println("L'interès és: " + interes);
    }

    public void calcularInteresPerAltresQuantitats() {
        double interes1 = calculaInteres(2000, 5, 2);
        System.out.println("Interés per 2000: " + interes1);

        double interes2 = calculaInteres(3000, 5, 3);
        System.out.println("Interés per 3000: " + interes2);
    }

    public void operacioFinal() {
        for (int i = 1; i <= 5; i++) {
            double interes = calculaInteres(1500 * i, 5, i);
            System.out.println("Interés de " + (1500 * i) + ": " + interes);
        }
    }
}

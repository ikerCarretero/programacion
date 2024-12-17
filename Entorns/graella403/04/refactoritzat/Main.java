package refactoritzat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String DIBUIXANT_CERCLE = "Dibuixant un cercle";
    private static final String DIBUIXANT_QUADRAT = "Dibuixant un quadrat";

    public static void main(String[] args) {
        // Crea una llista de nombres
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Calcular la suma dels nombres
        int sum = sumNumbers(numbers);
        System.out.println("La suma és: " + sum);

        // Dibuixar formes
        dibuixaForma("quadrada");
        dibuixaForma("circular");
    }

    public static int sumNumbers(List<Integer> numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void dibuixaForma(String forma) {
        if (forma.equals("quadrada")){
        System.out.println(DIBUIXANT_QUADRAT);
        // Lògica per dibuixar un quadrat
        }
        else if (forma.equals("circular")){
            System.out.println(DIBUIXANT_CERCLE);
            // Lògica per dibuixar un cercle
        }
    }
}

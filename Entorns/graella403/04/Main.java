import java.util.ArrayList;
import java.util.List;

public class Main {
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
        dibuixaQuadrat();
        dibuixaCercle();
    }

    public static int sumNumbers(List<Integer> nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public static void dibuixaQuadrat() {
        System.out.println("Dibuixant un quadrat");
        // Lògica per dibuixar un quadrat
    }

    public static void dibuixaCercle() {
        System.out.println("Dibuixant un cercle");
        // Lògica per dibuixar un cercle
    }
}

public class Calculator {
    public void calculate() {
        int a = 5;
        int b = 10;
        int sum = add(a, b);
        int product = multiply(a, b);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }

    private int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    private int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

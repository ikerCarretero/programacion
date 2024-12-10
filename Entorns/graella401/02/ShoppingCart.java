public class ShoppingCart {
    public double calculateTotal(double[] prices, double discount) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        total -= total * discount / 100;
        return total;
    }
}


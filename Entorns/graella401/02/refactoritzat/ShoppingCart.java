public class ShoppingCart {
    public double calculateTotal(double[] prices, double discount) {
        double total = sumPrices(prices);
        total = applyDiscount(discount, total);
        return total;
    }

    private double sumPrices(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    private double applyDiscount(double discount, double total) {
        total -= total * discount / 100;
        return total;
    }
}


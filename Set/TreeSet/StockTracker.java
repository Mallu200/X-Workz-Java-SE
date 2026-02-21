import java.util.TreeSet;

class StockTracker {
    public static void main(String[] args) {
        TreeSet<Double> prices = new TreeSet<>();

        prices.add(150.50);
        prices.add(152.20);
        prices.add(148.10);
        prices.add(155.00);

        // Find prices less than 151.00
        System.out.println("Prices below $151: " + prices.headSet(151.00));
        // Find prices between 149 and 153
        System.out.println("Mid-range prices: " + prices.subSet(149.00, 153.00));
    }
}
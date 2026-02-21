@FunctionalInterface
interface StockAlert {
    boolean isLow(int count); // Single abstract method for logic check
}

class Warehouse {
    public static void main(String[] args) {
        // Lambda defining "low stock" as anything under 5 items
        StockAlert alert = (qty) -> qty < 5;

        System.out.println("Alert for 3 items: " + alert.isLow(3)); // Prints true
    }
}
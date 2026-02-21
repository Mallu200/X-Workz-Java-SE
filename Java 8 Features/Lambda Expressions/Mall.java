@FunctionalInterface
interface Discounter {
    double apply(double price);
}

class Mall {
    public static void main(String[] args) {
        // Lambda: Takes price and returns 90% of it
        Discounter tenPercentOff = price -> price * 0.90;

        // Single line comment: Calculates the discounted price of a 100 dollar item
        System.out.println("Price after discount: $" + tenPercentOff.apply(100.0));
    }
}
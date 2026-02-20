class PaymentSystem {
    public static void main(String[] args) {
        int productPrice = 500; // Whole number
        double finalPrice = productPrice; // Widening (Automatic)

        System.out.println("Integer Price: " + productPrice);
        System.out.println("Decimal Price for Tax: " + finalPrice); // Output: 500.0
    }
}
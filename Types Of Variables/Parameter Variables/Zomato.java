class Zomato {
    // Parameter variable: 'coupon' receives the input from the user
    public static void applyDiscount(String coupon) {
        System.out.println("Processing coupon: " + coupon);
        System.out.println("Discount applied successfully!");
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        // Calling the method and passing the argument
        applyDiscount("ZOMATO50");

        System.out.println("Main ended");
    }
}
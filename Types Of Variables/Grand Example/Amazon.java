class Amazon {
    // 1. STATIC: Shared platform name
    static String platform = "Amazon India";

    // 2. INSTANCE: Every order has a different product
    String productName;

    // 3. PARAMETER: 'qty' is the number of items ordered
    public void placeOrder(int qty) {
        // 4. LOCAL: Delivery charge is a temporary calculation
        int deliveryCharge = 40;

        System.out.println("Welcome to " + platform);
        System.out.println("Ordered: " + productName);
        System.out.println("Quantity: " + qty);
        System.out.println("Shipping: ₹" + deliveryCharge);
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        Amazon order1 = new Amazon();
        order1.productName = "Laptop";
        order1.placeOrder(1);

        System.out.println("Main ended");
    }
}
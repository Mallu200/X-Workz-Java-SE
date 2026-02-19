class ShoppingCart {
    int itemCount;
    double totalBill;

    // No-Argument Constructor
    // Logic: Ensures every new user starts with a clean, zeroed-out bill
    ShoppingCart() {
        System.out.println("Constructor ShoppingCart() started");
        
        itemCount = 0;
        totalBill = 0.0;
        
        System.out.println("New Guest Cart Created.");
        System.out.println("Constructor ShoppingCart() ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        // Triggers the constructor to set up the 'cart' object memory
        ShoppingCart cart = new ShoppingCart();
        
        // Outputting values to confirm initialization
        System.out.println("Items in cart: " + cart.itemCount);
        System.out.println("Bill Amount: ₹" + cart.totalBill);
        
        System.out.println("Main method ended");
    }
}
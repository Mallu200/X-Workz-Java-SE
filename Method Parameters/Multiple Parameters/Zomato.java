class Zomato {
    // Parameter 1: String foodItem, Parameter 2: int quantity
    static void placeOrder(String foodItem, int quantity) {
        System.out.println("Method placeOrder started");
        
        // Logic: Calculating order summary
        System.out.println("Order received: " + quantity + " x " + foodItem);
        System.out.println("Status: Preparing your meal...");
        
        System.out.println("Method placeOrder ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Passing arguments: String first, int second
        placeOrder("Paneer Tikka", 2);
        
        System.out.println("Main ended");
    }
}
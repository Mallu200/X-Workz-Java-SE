class Order {
    String pizzaType;
    int price;

    // Standard Constructor: Used for the very first order
    Order(String type, int p) {
        System.out.println("Constructor 1: Creating a fresh order...");
        this.pizzaType = type;
        this.price = p;
    }

    // Copy Constructor: Used for 'Repeat Order' logic
    Order(Order previousOrder) {
        System.out.println("Constructor 2: Copying details from history...");
        if (previousOrder != null) {
            // Mapping values from the old object to the new instance
            this.pizzaType = previousOrder.pizzaType;
            this.price = previousOrder.price;
        } else {
            System.out.println("Error: No previous order found to copy.");
        }
    }
	
    void displayOrder() {
        System.out.println("Pizza: " + pizzaType + " | Price: ₹" + price);
    }

    public static void main(String args[]) {
        System.out.println("Main method started");

        // First Order
        Order lastFriday = new Order("Margherita", 350);
        
        // Repeating the order today
        Order today = new Order(lastFriday);
		
        System.out.println("\n--- Order Summary ---");
        lastFriday.displayOrder();
        today.displayOrder();
        
        System.out.println("Main method ended");
    }
}
class Pizza {
    String size;
    String topping;

    // Parameterized Constructor
    // Goal: To initialize a specific order with custom preferences
    Pizza(String size, String topping) {
        System.out.println("Constructor Pizza(String, String) started");
        
        this.size = size;       // Saving the input size into the object
        this.topping = topping; // Saving the input topping into the object
        
        System.out.println("Order: " + size + " pizza with " + topping);
        System.out.println("Constructor Pizza(String, String) ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        // Creating a customized object in a single step
        Pizza order = new Pizza("Medium", "Paneer");
        
        // Accessing the object's unique data
        System.out.println("Preparing " + order.size + " base...");
        
        System.out.println("Main method ended");
    }
}
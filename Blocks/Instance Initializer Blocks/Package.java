class Package {
    // --- INSTANCE INITIALIZER BLOCK ---
    // Rule: This code is automatically copied into the beginning of EVERY constructor.
    // Use Case: Shared initialization logic regardless of which constructor is called.
    {
        System.out.println(">> [LOGISTICS] Instance Block: Generating Universal Tracking ID...");
        System.out.println(">> [LOGISTICS] Instance Block: Timestamping creation time...");
        System.out.println("---------------------------------------------------------");
    }
    
    // Constructor 1: No arguments
    Package() {
        System.out.println(">> [SHIPMENT] Constructor: Standard Delivery Created.");
    }
    
    // Constructor 2: Overloaded with 'type'
    Package(String type) {
        System.out.println(">> [SHIPMENT] Constructor: " + type + " Delivery Created.");
    }
    
    public static void main(String[] args) {
        System.out.println(">> [MAIN] Processing Shipment 1...");
        new Package(); // Calls Instance Block, then Package()

        System.out.println("\n>> [MAIN] Processing Shipment 2...");
        new Package("Express"); // Calls Instance Block, then Package(String)
    }
}
class EOrder {
    String product;
    double price;
    double taxRate;
    String trackingID;

    // Instance Initialization Block
    // Logic: Runs for every order to ensure tracking and tax are never null
    {
        this.taxRate = 18.0; // Standard 18% GST
        this.trackingID = "TRK-" + Math.random(); 
        System.out.println(">> [AUTO-SYSTEM] Generated Tracking: " + trackingID);
        System.out.println(">> [AUTO-SYSTEM] Applied GST: " + taxRate + "%");
    }

    // Constructor 1: Full Details
    EOrder(String product, double price) {
        this.product = product;
        this.price = price + (price * taxRate / 100);
        System.out.println("Constructor: Processing " + product + " (Total with Tax: ₹" + this.price + ")");
    }

    // Constructor 2: Gift Order (Chains to Constructor 1)
    EOrder(String product) {
        this(product, 500.0); // Default gift value
        System.out.println("Constructor: Default Gift Price applied.");
    }

    void printInvoice() {
        System.out.println("Final Invoice -> " + product + " | Total: ₹" + price + " | ID: " + trackingID);
    }

    public static void main(String args[]) {
        System.out.println("--- New Customer Order ---");
        EOrder order1 = new EOrder("Laptop", 50000);
        order1.printInvoice();

        System.out.println("\n--- New Gift Voucher ---");
        EOrder gift = new EOrder("Gift Card");
        gift.printInvoice();
    }
}
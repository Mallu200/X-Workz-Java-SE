class ReceiptPrinter {
    // VOID: Performs a task (printing) but returns no data.
    static void printReceipt(double amount) {
        System.out.println("--- Receipt ---");
        System.out.println("Total Paid: ₹" + amount);
        System.out.println("Thank you for shopping!");
        // No return statement here!
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Calling the method directly. 
        // We CANNOT do: double x = printReceipt(500); -> This would be an error.
        printReceipt(450.75);
        
        System.out.println("Main ended");
    }
}
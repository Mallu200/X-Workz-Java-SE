class PhonePe {
    public static void main(String args[]) {
        System.out.println("Main started");

        double balance = 0.50;
        double bill = 100.00;

        // VALIDATION: Balance Check
        if (balance < bill) {
            // Since 0.50 is less than 100.00, this block triggers.
            System.out.println("Error: Insufficient Funds.");
            
            // THE RETURN:
            // This exits the 'main' method immediately.
            // The code below (Transaction in progress) is NEVER reached.
            return; 
        }

        // SECURE AREA: Only runs if balance is sufficient
        System.out.println("Transaction in progress...");
        System.out.println("Payment Successful!");

        System.out.println("Main ended");
    }
}
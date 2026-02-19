class TransactionRecord {
    public static void main(String[] args) {
        System.out.println("Main started");

        float[] amounts = {1500.0f, 200.5f};

        // [F@... means Array of Floats
        System.out.println("Transaction Pointer: " + amounts);
        
        System.out.println("Amount Paid: ₹" + amounts[0]);

        System.out.println("Main ended");
    }
}
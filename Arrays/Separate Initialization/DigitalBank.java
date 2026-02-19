class DigitalBank {
    public static void main(String[] args) {
        System.out.println("Main started");

        // Step 1: Create space for 3 decimal values
        double[] balances = new double[3];

        // Step 2: Assign specific values
        balances[0] = 50000.75;
        balances[1] = 1200.50;
        balances[2] = 89000.00;

        System.out.println("Customer 1 Balance: ₹" + balances[0]);
        System.out.println("Customer 3 Balance: ₹" + balances[2]);

        System.out.println("Main ended");
    }
}
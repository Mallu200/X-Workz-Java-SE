class ATM {
    // Parameter variable: 'amount' receives the numeric value to withdraw
    public static void withdrawMoney(int amount) {
        System.out.println("Withdrawal request for: ₹" + amount);
        System.out.println("Please collect your cash.");
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        // Passing 5000 as the input for the 'amount' parameter
        withdrawMoney(5000);

        System.out.println("Main ended");
    }
}
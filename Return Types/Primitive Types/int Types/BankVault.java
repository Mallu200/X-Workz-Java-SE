class BankVault {
    // int is perfect for whole currency units
    static int getAccountBalance() {
        // Logic: Returns balance in ₹ (e.g., 50,000)
        return 50000; 
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        int balance = getAccountBalance();
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("Main ended");
    }
}
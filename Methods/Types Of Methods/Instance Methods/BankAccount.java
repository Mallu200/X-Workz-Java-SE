class BankAccount {
    // STATE: The internal "vault" for this specific account
    double balance = 500.0;

    // INSTANCE METHOD: The only authorized way to add money
    void deposit(double amount) {
        // Log the transaction start
        System.out.println("Processing deposit of: ₹" + amount);
        
        // UPDATE STATE: Increase the specific account's balance
        balance += amount;
        
        System.out.println("Transaction Successful!");
        System.out.println("New Balance: ₹" + balance);
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // Step 1: Create a unique account object (Instance)
        BankAccount myAcc = new BankAccount();
        
        // Step 2: Perform an action on that specific account
        myAcc.deposit(1000.0); 

        // Step 3: Verify independence
        BankAccount secondAcc = new BankAccount();
        System.out.println("Second Account Balance: ₹" + secondAcc.balance); // Still ₹500.0

        System.out.println("Main ended");
    }
}
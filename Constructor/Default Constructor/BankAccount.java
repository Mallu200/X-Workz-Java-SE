class BankAccount {
    double balance;
    String status;

    // No-Argument Constructor
    // Logic: Standardizes the initial state of a new bank account
    BankAccount() {
        System.out.println("Constructor BankAccount() started");
        
        balance = 0.0;
        status = "Active";
        
        System.out.println("Account opened with ₹" + balance + " balance.");
        System.out.println("Status: " + status);
        
        System.out.println("Constructor BankAccount() ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        // Creating the 'myAcc' object automatically calls the constructor
        BankAccount myAcc = new BankAccount();
        
        // Final check on the account readiness
        System.out.println("Verification: Account is " + myAcc.status);
        
        System.out.println("Main method ended");
    }
}
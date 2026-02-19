class BankAccount {
    String holderName;
    double balance;

    // Parameterized Constructor
    // Logic: Couples the account creation with the actual customer data
    BankAccount(String name, double deposit) {
        System.out.println("Constructor BankAccount(String, double) started");
        
        this.holderName = name; // Mapping input name to object field
        this.balance = deposit; // Mapping input deposit to object balance
        
        System.out.println("Account opened for " + name + " with ₹" + balance);
        System.out.println("Constructor BankAccount(String, double) ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        // Creating the 'acc' object with specific initial values
        BankAccount acc = new BankAccount("Rahul", 5000.0);
        
        // Verifying the account details
        System.out.println("Current Balance for " + acc.holderName + ": ₹" + acc.balance);
        
        System.out.println("Main method ended");
    }
}
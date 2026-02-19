class BankAccount {
    String holder;
    double balance;

    // Standard Constructor: For opening a new individual account
    BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    // Copy Constructor: For converting or linking accounts
    // Logic: Inherits the balance but updates the holder's designation
    BankAccount(BankAccount primary) {
        if (primary != null) {
            this.holder = "Joint: " + primary.holder;
            this.balance = primary.balance;
            System.out.println("New Joint Account created based on primary account.");
        }
    }
	
    void display() {
        System.out.println("Holder: " + holder + " | Balance: ₹" + balance);
    }

    public static void main(String args[]) {
        System.out.println("Main method started");

        // Create the primary individual account
        BankAccount personal = new BankAccount("Arjun", 10000.0);
        
        // Use the copy constructor to 'spawn' a joint account from the personal one
        BankAccount joint = new BankAccount(personal);
		
        System.out.println("\n--- Final Status ---");
        personal.display();
        joint.display();
        
        System.out.println("Main method ended");
    }
}
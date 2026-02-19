class Transaction {
    // --- INSTANCE INITIALIZER BLOCK ---
    // Rule 1: It runs AFTER the parent's constructor (super) 
    // Rule 2: It runs BEFORE the current class constructor.
    // Rule 3: Perfect for mandatory checks that apply to ALL constructors.
    {
        System.out.println(">> [SECURE] Instance Block: Initializing SSL Session...");
        System.out.println(">> [SECURE] Instance Block: Checking Firewall Status...");
        System.out.println("--------------------------------------------------");
    }

    // --- CONSTRUCTOR ---
    Transaction(double amt) {
        System.out.println(">> [PROCESS] Constructor: Processing Withdrawal of ₹" + amt);
    }

    public static void main(String args[]) {
        System.out.println(">> [MAIN] Starting Transaction 1...");
        new Transaction(5000);

        System.out.println("\n>> [MAIN] Starting Transaction 2...");
        new Transaction(2500);
    }
}
class History {
    // This child object serves as the internal audit trail for the parent.
    void log() { 
        System.out.println(">> [DB-ENCRYPTION] Transaction hash generated and logged to internal ledger."); 
    }
}

class BankAccount {
    long accNum;
    
    // --- STEP 1: COMPOSITION (PRIVATE OWNERSHIP) ---
    // The History object is private. No other class can access or 
    // modify the history of this account directly.
    private final History history; 

    // --- STEP 2: MANDATORY INTERNAL INITIALIZATION ---
    // The life of the History log is tied to the creation of the account.
    BankAccount(long accNum) {
        this.accNum = accNum;
        // COMPOSITION: The 'History' part is created here.
        this.history = new History(); 
        System.out.println(">> [CORE-BANKING] Account " + accNum + " opened with a fresh audit log.");
    }

    void deposit(int amt) {
        System.out.println("\n--- [TRANSACTION IN-PROGRESS] ---");
        System.out.println("Account Number : " + this.accNum);
        System.out.println("Action         : Credit " + amt);
        
        // The parent uses its internal part to perform a required task
        history.log();
        
        System.out.println("Status         : Balance Updated.");
        System.out.println("---------------------------------\n");
    }
}

class CompositionFinance {
    public static void main(String[] args) {
        System.out.println(">> [SYS] Accessing Secure Banking Gateway...");

        // 1. Create the Parent (BankAccount)
        // The 'History' object is created silently inside the constructor.
        BankAccount myAcc = new BankAccount(12345678L);
        
        // 2. Perform operations
        myAcc.deposit(5000);

        // 3. THE STRONG LINK TEST:
        // When 'myAcc' is set to null, the BankAccount object becomes unreachable.
        // Because 'history' was a field inside that object, it is also lost.
        System.out.println(">> [SECURITY] Purging account data from local memory...");
        myAcc = null; 

        // 4. Verification
        // There is no independent 'History' variable in main to access the logs.
        // The log died with the account.
        System.out.println(">> [GC] Account and its private History log are marked for deletion.");
        
        System.out.println(">> [SYS] Connection Closed.");
    }
}
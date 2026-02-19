class Account {
    String accountNumber;

    // Parent demands an account number to exist
    Account(String id) {
        this.accountNumber = id;
        System.out.println("Step 1: Account " + id + " verified.");
    }
}

class SavingsAccount extends Account {
    double interestRate;

    // ERROR PREVENTED: If we didn't write super(id), this code wouldn't compile!
    SavingsAccount(String id, double rate) {
        super(id); // Mandatory! Java cannot do this implicitly anymore.
        this.interestRate = rate;
        System.out.println("Step 2: Savings account features activated.");
    }

    void display() {
        System.out.println("ID: " + accountNumber + " | Interest: " + interestRate + "%");
    }

    public static void main(String args[]) {
        System.out.println("--- Opening Savings Account ---");
        SavingsAccount sa = new SavingsAccount("SAV-99", 4.5);
        sa.display();
    }
}
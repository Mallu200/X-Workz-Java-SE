class Account {
    long accNumber = 123456789L;
    double balance = 5000.00;
}

class BankSystem {
    // Parameter 'acc' receives the reference to the actual account
    static void deposit(Account acc) {
        System.out.println("Method deposit started");
        
        acc.balance = acc.balance + 1000.00; // Modifying the object's data
        System.out.println("Updated Balance for " + acc.accNumber + ": ₹" + acc.balance);
        
        System.out.println("Method deposit ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        Account myAcc = new Account();
        deposit(myAcc);
        System.out.println("Main ended");
    }
}
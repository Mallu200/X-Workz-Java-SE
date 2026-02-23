// Step 1: Create the Custom Exception class
// Extending 'Exception' makes this a CHECKED exception
class InsufficientFundsException extends Exception {
    private double amount;

    // Constructor to accept a custom error message
    public InsufficientFundsException(double amount) {
        // Pass the message to the parent Exception class
        super("Sorry, but you are short $" + amount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

// Step 2: Create a class that uses the custom exception
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // The 'throws' keyword declares that this method might result in an error
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double needs = amount - balance;
            // The 'throw' keyword manually triggers the exception instance
            throw new InsufficientFundsException(needs);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
    }
}

// Step 3: Main class to handle the custom exception
public class CustomExceptionDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500.00);

        try {
            System.out.println("Attempting to withdraw $600...");
            myAccount.withdraw(600.00); // This will trigger the exception
        } 
        // Catching our specific user-defined exception
        catch (InsufficientFundsException e) {
            System.err.println("Transaction Failed!");
            System.err.println(e.getMessage());
            System.err.println("Missing amount: $" + e.getAmount());
        } 
        finally {
            // This block runs no matter what
            System.out.println("Thank you for using our ATM.");
        }
    }
}
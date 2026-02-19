class RBI {
    // Parent Method: Base policy for all banks in the country
    void getInterestRate() {
        System.out.println("Method getInterestRate (Parent) started");
        
        System.out.println("Default Interest Rate: 2%");
        
        System.out.println("Method getInterestRate (Parent) ended");
    }
}

class SBI extends RBI {
    // Overriding: Redefining the rate specifically for SBI customers
    @Override 
    void getInterestRate() {
        System.out.println("Method getInterestRate (Child) started");
        
        // Specific Logic: Providing a higher, bank-specific interest rate
        System.out.println("SBI Interest Rate: 7.5%");
        
        System.out.println("Method getInterestRate (Child) ended");
    }
}

class BankInterestRate {
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Reference and Object are both SBI
        SBI bank = new SBI();
        
        // JVM looks at the object type (SBI) and executes its version
        bank.getInterestRate(); 

        System.out.println("Main method ended");
    }
}
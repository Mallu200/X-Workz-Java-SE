class Payment {
    // Version 1: Accepts an 'int' parameter (Whole numbers)
    void pay(int amount) {
        System.out.println("Method pay(int) started");
        
        // Logic: Handling simple cash/whole number transactions
        System.out.println("Paid: ₹" + amount);
        
        System.out.println("Method pay(int) ended");
    }

    // Version 2: Accepts a 'double' parameter (Decimal numbers)
    // This is Overloading: same name 'pay', different parameter type
    void pay(double amount) {
        System.out.println("Method pay(double) started");
        
        // Logic: Handling precise digital/decimal transactions
        System.out.println("Paid with decimals: ₹" + amount);
        
        System.out.println("Method pay(double) ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        Payment p = new Payment();
        
        // Calls Version 1 because 500 is an integer
        p.pay(500);
        
        System.out.println("--------------------");
        
        // Calls Version 2 because 500.50 is a double
        p.pay(500.50);
        
        System.out.println("Main method ended");
    }
}
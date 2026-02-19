class CurrencyConverter {
    // STATIC METHOD: toINR
    // It takes USD as input and returns the equivalent INR.
    // No object (new CurrencyConverter) is needed to use this.
    static double toINR(double usd) {
        // Log the conversion start
        System.out.println("Converting $" + usd + " to INR...");

        // Calculation using the current exchange rate
        return usd * 83.0; 
    }
    
    public static void main(String[] args) {
        System.out.println("Main started");

        // CALLING THE METHOD:
        // Because it's static, we use: ClassName.methodName(value)
        double myRupees = CurrencyConverter.toINR(50);
        
        System.out.println("Value: ₹" + myRupees);

        // We can use it again instantly for a different value
        System.out.println("Value of $100: ₹" + CurrencyConverter.toINR(100));

        System.out.println("Main ended");
    }
}
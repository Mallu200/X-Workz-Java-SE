class ShoppingMall {
    // USER-DEFINED METHOD: applyDiscount
    // Input: The raw bill amount
    // Output: The final bill after applying rules
    static double applyDiscount(double bill) {
        // LOGIC: Flat ₹100 off if shopping exceeds ₹500
        if (bill > 500) {
            // Early Return: If the condition is met, we exit the method 
            // with the discounted price immediately.
            return bill - 100;
        }
        
        // Final Return: If bill <= 500, we just return the original amount.
        return bill;
    }
    
    public static void main(String[] args) {
        System.out.println("Main started");

        double myTotal = 650.0;
        
        // Calling the method and printing the result
        // Since 650 > 500, the method returns 550.0
        System.out.println("Original Bill: ₹" + myTotal);
        System.out.println("Final Payable: ₹" + applyDiscount(myTotal));

        // Testing the "No Discount" case
        System.out.println("Small Purchase: ₹" + applyDiscount(200.0));

        System.out.println("Main ended");
    }
}
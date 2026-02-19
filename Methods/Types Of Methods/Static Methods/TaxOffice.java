class TaxOffice {
    // STATIC METHOD: addGST
    // 'static' means this method belongs to the CLASS, not an object.
    // It's like a calculator sitting on a desk that everyone shares.
    static double addGST(double amount) {
        // Log the tax calculation
        System.out.println("Calculating 18% GST for: " + amount);
        
        // Formula: Original + 18% of Original
        return amount + (amount * 0.18);
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // CALLING THE METHOD:
        // Notice we don't use 'new TaxOffice()'. 
        // We call it directly using the Class Name.
        double total = TaxOffice.addGST(1000);
        
        System.out.println("Base Price: 1000");
        System.out.println("Total with GST: " + total);

        System.out.println("Main ended");
    }
}
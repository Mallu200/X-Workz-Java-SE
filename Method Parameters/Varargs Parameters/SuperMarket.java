class SuperMarket {
    // double... prices handles a flexible list of item costs
    static void generateBill(double... prices) {
        System.out.println("Method generateBill started");
        
        double total = 0;
        for (double p : prices) {
            total += p;
        }
        
        System.out.println("Items scanned: " + prices.length);
        System.out.println("Final Bill: ₹" + total);
        
        System.out.println("Method generateBill ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Passing 4 arguments
        generateBill(10.50, 55.00, 120.00, 5.00); 
        
        System.out.println("Main ended");
    }
}
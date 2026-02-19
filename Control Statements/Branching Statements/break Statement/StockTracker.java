class StockTracker {
    public static void main(String args[]) {
        System.out.println("Main started");

        int hourlyPrices[] = {150, 155, 162, 160, 158};
        int targetPrice = 160;

        // FOR-EACH LOOP: Iterating through the price data
        // Read as: "For every 'price' in the 'hourlyPrices' array..."
        for (int price : hourlyPrices) {
            
            // LOGIC CHECK: Has the stock hit our goal?
            if (price >= targetPrice) {
                // Since 162 is >= 160, this triggers on the 3rd item
                System.out.println("Target Reached: ₹" + price + ". Selling Stock!");
                
                // THE BREAK: Once the sale is made, we stop the loop.
                // We don't care about the remaining prices (160, 158).
                break; 
            }
            System.out.println("Current Price: ₹" + price + "... waiting.");
        }

        System.out.println("Main ended");
    }
}
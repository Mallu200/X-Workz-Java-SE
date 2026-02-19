class FinanceTracker {
    // double[] is a non-primitive array of decimals
    static double[] getWeeklyStockPrices() {
        // Logic: Returns a fixed set of 5 daily closing prices
        double[] prices = {150.50, 152.20, 149.80, 155.00, 153.10};
        return prices; 
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        double[] results = getWeeklyStockPrices();
        
        // Accessing the first price using index 0
        System.out.println("Monday Price: $" + results[0]);
        System.out.println("Data points collected: " + results.length);
        System.out.println("Main ended");
    }
}
class ExpenseManager {
    // Parameter 'costs' is an array of double values
    static void calculateTotal(double[] costs) {
        System.out.println("Method calculateTotal started");
        
        double sum = 0;
        // Logic: Iterating through the array to sum up values
        for (double price : costs) {
            sum += price;
        }
        
        System.out.println("Total Expenses: ₹" + sum);
        System.out.println("Method calculateTotal ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        double[] bills = {120.50, 450.00, 89.99, 1200.00};
        calculateTotal(bills); // Passing the array reference
        System.out.println("Main ended");
    }
}
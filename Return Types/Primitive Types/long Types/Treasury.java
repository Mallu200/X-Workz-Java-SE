class Treasury {
    // long is required for values in the trillions
    static long getNationalDebt() {
        // Logic: Returns debt in Rupees (e.g., 150 Trillion)
        return 150000000000000L; // Suffix 'L' is mandatory
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        long debt = getNationalDebt();
        System.out.println("Current National Debt: ₹" + debt);
        System.out.println("Main ended");
    }
}
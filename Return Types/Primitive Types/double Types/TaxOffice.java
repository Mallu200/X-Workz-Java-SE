class TaxOffice {
    // double is the standard for high-precision financial math
    static double calculateServiceTax() {
        // Logic: Returns the tax amount for a high-value bill
        return 1450.85; 
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        double tax = calculateServiceTax();
        System.out.println("Total Service Tax: ₹" + tax);
        System.out.println("Main ended");
    }
}
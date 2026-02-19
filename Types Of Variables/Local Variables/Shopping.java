class Shopping {
    public static void main(String[] args) {
        System.out.println("Main started");

        double billAmount = 5000.0;
        // Local variable: Used only for this specific calculation
        double discountAmount = 500.0;

        double finalPrice = billAmount - discountAmount;

        System.out.println("Total Bill: ₹" + billAmount);
        System.out.println("Discount Applied: ₹" + discountAmount);
        System.out.println("Final Payable: ₹" + finalPrice);

        System.out.println("Main ended");
    }
}
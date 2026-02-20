class Supermarket {
    public static void main(String[] args) {
        double totalBill = 155.95;
        int cashToPay = (int) totalBill; // Manual Narrowing

        System.out.println("Original Bill: " + totalBill);
        System.out.println("Cash Amount Collected: " + cashToPay); // Output: 155
    }
}
class Bank {
    // Static variable: The interest rate is common for all account holders
    static double interestRate = 7.5;

    public static void main(String[] args) {
        System.out.println("Main started");

        System.out.println("Bank Name: SBI");
        System.out.println("Current Interest Rate: " + interestRate + "%");

        System.out.println("Main ended");
    }
}
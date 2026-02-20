class BankInterest {
    public static void main(String[] args) {
        int principal = 10000;
        int rate = 7;
        int time = 1;

        // Interest = (P * R * T) / 100
        int interest = (principal * rate * time) / 100;

        System.out.println("Yearly Interest: " + interest); // 700
    }
}
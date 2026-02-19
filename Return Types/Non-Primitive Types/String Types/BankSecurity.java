class BankSecurity {
    // String is ideal for formatting data for display
    static String getMaskedCardNumber() {
        // Logic: Returns the card with 'X' marks for safety
        return "XXXX-XXXX-XXXX-1234";
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        String card = getMaskedCardNumber();
        System.out.println("Active Card: " + card);
        System.out.println("Main ended");
    }
}
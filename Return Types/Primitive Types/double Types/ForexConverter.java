class ForexConverter {
    // double tracks minor fluctuations in currency rates
    static double getExchangeRate() {
        // Logic: Returns current USD to INR rate
        return 83.1245;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        double rate = getExchangeRate();
        System.out.println("Current USD to INR Rate: " + rate);
        System.out.println("Main ended");
    }
}
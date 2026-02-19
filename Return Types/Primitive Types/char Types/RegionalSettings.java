class RegionalSettings {
    // char can store any Unicode symbol
    static char getCurrencySymbol() {
        // Logic: Returns the symbol for Japanese Yen
        return '¥';
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        char symbol = getCurrencySymbol();
        System.out.println("Local Currency Symbol: " + symbol);
        System.out.println("Main ended");
    }
}
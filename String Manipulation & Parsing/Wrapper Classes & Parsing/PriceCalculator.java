class PriceCalculator {
    public static void main(String[] args) {
        String priceText = "1500.50";
        
        // Convert to double to handle decimals
        double price = Double.parseDouble(priceText);
        double discount = price * 0.10;
        
        System.out.println("Final Price: " + (price - discount));
    }
}
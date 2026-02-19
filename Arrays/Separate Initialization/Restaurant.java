class Restaurant {
    public static void main(String[] args) {
        System.out.println("Main started");

        // Step 1: Allocation
        float[] specialPrices = new float[3];

        // Step 2: Initialization
        specialPrices[0] = 299.0f;
        specialPrices[1] = 150.5f;
        specialPrices[2] = 450.0f;

        System.out.println("Special Item 1 Price: ₹" + specialPrices[0]);
        System.out.println("Total Specials available: " + specialPrices.length);

        System.out.println("Main ended");
    }
}
class DiscountEngine {
    // float works well for simple percentage values
    static float getSeasonalDiscount() {
        // Logic: Returns a 12.5% discount rate
        return 12.5f;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        float rate = getSeasonalDiscount();
        System.out.println("Applied Discount: " + rate + "%");
        System.out.println("Main ended");
    }
}
class CourierService {
    // float is standard for physical weight measurements
    static float getPackageWeight() {
        // Logic: Returns weight in Kilograms
        return 4.75f;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        float weight = getPackageWeight();
        System.out.println("Shipping Weight: " + weight + " kg");
        System.out.println("Main ended");
    }
}
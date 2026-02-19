class CricketStats {
    // float is used for simple performance ratios
    static float getRunRate() {
        // Logic: Returns runs per over
        return 6.2f;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        float rr = getRunRate();
        System.out.println("Current Run Rate: " + rr);
        System.out.println("Main ended");
    }
}
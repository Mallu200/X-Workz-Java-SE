class WorldMetrics {
    // long is needed once counts exceed 2.1 Billion
    static long getWorldPopulation() {
        // Logic: Returns approx 8.1 Billion
        return 8100000000L;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        long totalPeople = getWorldPopulation();
        System.out.println("Global Population: " + totalPeople);
        System.out.println("Main ended");
    }
}
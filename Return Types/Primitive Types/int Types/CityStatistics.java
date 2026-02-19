class CityStatistics {
    // int handles city-sized populations
    static int getPopulation() {
        // Logic: Returns the population of Bengaluru
        return 8443675;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        int people = getPopulation();
        System.out.println("Current City Population: " + people);
        System.out.println("Main ended");
    }
}
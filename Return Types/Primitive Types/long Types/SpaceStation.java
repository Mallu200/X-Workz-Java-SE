class SpaceStation {
    // long is essential for astronomical distances
    static long getDistanceToSun() {
        // Logic: Returns distance in km (approx 149.6 Million km)
        // Note: Even if it fits in int, long is safer for space math
        return 149600000L; 
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        long distance = getDistanceToSun();
        System.out.println("Distance to Sun: " + distance + " km");
        System.out.println("Main ended");
    }
}
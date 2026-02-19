class GPSLocator {
    // double is essential for precise geographical coordinates
    static double getLatitude() {
        // Logic: Returns the precise latitude of a landmark
        return 12.9715987;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        double lat = getLatitude();
        System.out.println("Current Latitude: " + lat);
        System.out.println("Main ended");
    }
}
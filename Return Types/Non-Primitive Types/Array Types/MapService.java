class MapService {
    // This array acts as a pair of coordinates
    static double[] getCurrentLocation() {
        // Logic: Returns [Latitude, Longitude]
        return new double[]{12.9716, 77.5946}; // Bengaluru coordinates
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        double[] coords = getCurrentLocation();
        System.out.println("Lat: " + coords[0] + " | Long: " + coords[1]);
        System.out.println("Main ended");
    }
}
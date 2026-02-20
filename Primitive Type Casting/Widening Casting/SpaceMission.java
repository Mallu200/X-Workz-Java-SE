class SpaceMission {
    public static void main(String[] args) {
        int kmFromEarth = 384400;
        long totalDistanceInMm = kmFromEarth; // Widening (Automatic)

        System.out.println("Distance in KM: " + kmFromEarth);
        System.out.println("Distance in Long format: " + totalDistanceInMm);
    }
}
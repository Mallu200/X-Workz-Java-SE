class LogisticsApp {
    // String handles dynamic locations and addresses
    static String getPackageLocation() {
        // Logic: Returns the latest shipping update
        return "Arrived at Bengaluru Sorting Facility";
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        String location = getPackageLocation();
        System.out.println("Tracking Update: " + location);
        System.out.println("Main ended");
    }
}
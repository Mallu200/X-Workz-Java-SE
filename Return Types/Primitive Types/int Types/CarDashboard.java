class CarDashboard {
    // int is the standard for odometer readings
    static int getTotalDistance() {
        // Logic: Returns distance in kilometers
        return 125430;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        int distance = getTotalDistance();
        System.out.println("Odometer Reading: " + distance + " km");
        System.out.println("Main ended");
    }
}
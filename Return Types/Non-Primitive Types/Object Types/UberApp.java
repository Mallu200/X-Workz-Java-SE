class Vehicle {
    String driver = "Ramesh";
    String carModel = "Tesla Model 3";
    double latitude = 12.9716;
}

class UberApp {
    // Returns a 'Vehicle' object
    static Vehicle findNearestCab() {
        return new Vehicle();
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        Vehicle cab = findNearestCab();
        System.out.println("Driver: " + cab.driver + " is arriving in a " + cab.carModel);
        System.out.println("Main ended");
    }
}
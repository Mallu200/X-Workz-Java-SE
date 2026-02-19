class Car {
    String model = "Mahindra XUV700";
    int lastServiceKm = 10000;
}

class ServiceCenter {
    // Parameter 'c' represents the car being serviced
    static void performService(Car c) {
        System.out.println("Method performService started");
        
        c.lastServiceKm = 15000; // Updating the data
        System.out.println("Service complete for: " + c.model);
        System.out.println("Next service due after 5000km.");
        
        System.out.println("Method performService ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        Car myCar = new Car();
        performService(myCar);
        System.out.println("Main ended");
    }
}
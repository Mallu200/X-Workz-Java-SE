class Car {
    // STATE: The car starts with 40 Liters of fuel
    int fuel = 40; 

    // INSTANCE METHOD: Simulates a trip that consumes fuel
    void drive() {
        // Log the action
        System.out.println("Driving 50km...");

        // UPDATE STATE: Consume 5 liters
        fuel -= 5;
        
        System.out.println("Fuel left: " + fuel + "L");

        // ADDED LOGIC: Low fuel warning
        if (fuel <= 10 && fuel > 0) {
            System.out.println("Warning: Low fuel! Please visit a station.");
        } else if (fuel <= 0) {
            System.out.println("Out of fuel. Car stopped.");
            fuel = 0; // Prevent negative fuel values
        }
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // Instantiate our specific car object
        Car myTesla = new Car();
        
        // Let's take three trips!
        myTesla.drive(); // 35L
        myTesla.drive(); // 30L
        myTesla.drive(); // 25L

        System.out.println("Main ended");
    }
}
interface Vehicle {
	void start();
	
	// Static: Belongs to the interface, used for common utility
	static void safetyCheck() {
		System.out.println("System: Performing global safety diagnostics..."); // Universal logic		
	}
}

class Car implements Vehicle {
	public void start() {
		System.out.println("Car engine started."); // Car-specific logic
	}
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle.safetyCheck(); // Called directly using the Interface name
        Car myCar = new Car();
        myCar.start();
    }
}
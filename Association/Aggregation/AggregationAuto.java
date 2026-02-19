class Wheel {
    String brand;
    int size;

    // --- STEP 1: INDEPENDENT COMPONENT ---
    // The wheel is manufactured as a standalone part.
    Wheel(String brand, int size) {
        this.brand = brand;
        this.size = size;
        // Mandatory SOP to track the independent lifecycle of the Part
        System.out.println(">> [FACTORY] Part Created: " + brand + " Wheel (Size: " + size + " inch)");
    }
}

class Car {
    String model;
    
    // --- STEP 2: AGGREGATION (HAS-A) ---
    // The Car 'has' wheels, but it did not create them.
    // It merely holds references to existing Wheel objects.
    Wheel[] wheels; 

    // Constructor: Receiving external references (Object Injection)
    Car(String model, Wheel[] wheels) {
        this.model = model;
        this.wheels = wheels;
        System.out.println(">> [ASSEMBLY] " + model + " has been fitted with " + wheels.length + " wheels.");
    }

    void drive() {
        System.out.println("\n--- [VEHICLE STATUS REPORT] ---");
        if (wheels != null && wheels.length > 0) {
            System.out.println("Vehicle Model : " + this.model);
            // Reaching into the aggregated object
            System.out.println("Tire Brand    : " + wheels[0].brand); 
            System.out.println("Action        : Rolling on " + wheels.length + " points of contact.");
        } else {
            System.out.println("Status        : Vehicle immobilized (No wheels detected).");
        }
        System.out.println("-------------------------------\n");
    }
}

class AggregationAuto {
    public static void main(String[] args) {
        System.out.println(">> [SYSTEM] Booting Logistics Module...");

        // 1. Create Child objects independently
        // These exist in the Heap before the Car even exists.
        Wheel w1 = new Wheel("Michelin", 18);
        
        // 2. Prepare the collection of children
        Wheel[] set = {w1, w1, w1, w1}; // Reusing the same reference for simplicity

        // 3. Create Parent and pass the children (Aggregation)
        Car myCar = new Car("Tesla Model S", set);
        myCar.drive();

        // 4. WEAK LINK TEST
        System.out.println(">> [ACTION] Decommissioning the Car...");
        myCar = null; // The Car object is now eligible for Garbage Collection
        
        // 5. Verification
        // The wheel 'w1' is still referenced by the 'w1' variable in main.
        System.out.println(">> [CHECK] Wheel Check: " + w1.brand + " is still in the inventory.");
        System.out.println(">> [SYSTEM] Car destroyed, but parts remain.");
    }
}
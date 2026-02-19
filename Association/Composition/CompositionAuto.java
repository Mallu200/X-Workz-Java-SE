class Engine {
    // This child is strictly internal to the Car's mechanical logic.
    void startEngine() {
        System.out.println(">> [MECHANICAL] Fuel Injection Active: VROOM... 2000 RPM.");
    }
}

class Car {
    String model;
    
    // --- STEP 1: COMPOSITION (STRONG HAS-A) ---
    // The Car 'owns' the engine. 
    // Private: No external access. 
    // Final: The engine cannot be swapped for another object after birth.
    private final Engine engine; 

    // --- STEP 2: INTERNAL BIRTH ---
    // The child is instantiated inside the parent's constructor.
    // The Engine doesn't exist until 'new Car()' is called.
    Car(String model) {
        this.model = model;
        this.engine = new Engine(); // COMPOSITION: Instant creation
        System.out.println(">> [FACTORY-LINE] Car " + model + " assembled with its integrated engine.");
    }

    void ignite() {
        System.out.println("\n--- [DASHBOARD INITIALIZATION] ---");
        System.out.println("Vehicle : " + this.model);
        
        // Delegating the ignition behavior to the internal engine object
        engine.startEngine();
        
        System.out.println("Status  : Ready to Drive.");
        System.out.println("----------------------------------\n");
    }
}

class CompositionAuto {
    public static void main(String[] args) {
        System.out.println(">> [SYS] Loading Automotive Composition Module...");

        // 1. Creation of the Parent
        // Notice: 'new Engine()' is never called in main. 
        Car myTesla = new Car("Model X");
        
        // 2. Utilize the system
        myTesla.ignite();

        // 3. THE STRONG LINK TEST:
        // By setting myTesla to null, the only reference to the Engine 
        // (stored inside the Car object) is permanently removed from the stack.
        System.out.println(">> [ACTION] Scrapping the Car (Setting to NULL)...");
        myTesla = null; 

        // 4. Verification
        // Unlike the 'Wheel' in Aggregation, there is no separate variable 
        // 'e1' to access the Engine now. It is gone.
        System.out.println(">> [GC] The Engine instance is now unreachable and will be cleared.");
        
        System.out.println(">> [SYS] Decommissioning Complete.");
    }
}
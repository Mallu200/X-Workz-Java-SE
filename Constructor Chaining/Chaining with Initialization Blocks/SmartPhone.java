class SmartPhone {
    String model;
    int batteryLevel;

    // Instance Initialization Block
    // This runs for EVERY constructor call!
    {
        batteryLevel = 100; // Factory default
        System.out.println("--- LOG: Hardware Diagnostic Check Passed (100% Battery) ---");
    }

    // Constructor 1: Custom Model
    SmartPhone(String model) {
        this.model = model;
        System.out.println("Constructor: Phone model set to " + model);
    }

    // Constructor 2: Default Model (Chains to Constructor 1)
    SmartPhone() {
        this("Generic Android");
        System.out.println("Constructor: Default model assigned");
    }

    void showSpecs() {
        System.out.println("Specs -> Model: " + model + " | Battery: " + batteryLevel + "%");
    }

    public static void main(String args[]) {
        System.out.println("Creating Phone 1...");
        SmartPhone p1 = new SmartPhone("Samsung S24");
        p1.showSpecs();

        System.out.println("\nCreating Phone 2...");
        SmartPhone p2 = new SmartPhone();
        p2.showSpecs();
    }
}
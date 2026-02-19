class Charger {
    String type;
    int wattage;

    // --- STEP 1: INDEPENDENT INSTANTIATION ---
    // The charger is manufactured as a standalone component.
    Charger(String type, int watts) {
        this.type = type;
        this.wattage = watts;
        System.out.println(">> [MANUFACTURING] Charger Created: " + type + " (" + watts + "W)");
    }
}

class Laptop {
    String brand;
    
    // --- STEP 2: ONE-TO-ONE ASSOCIATION ---
    // The Laptop class 'has-a' reference variable named 'myCharger'.
    // This variable will hold the memory address of a Charger object.
    Charger myCharger;

    // Constructor: Linking the Charger to the Laptop (Dependency Injection)
    Laptop(String brand, Charger myCharger) {
        this.brand = brand;
        
        // Storing the reference of the passed Charger object into our local variable
        this.myCharger = myCharger; 
        System.out.println(">> [ASSEMBLY] " + brand + " laptop is now paired with " + myCharger.type);
    }

    void powerOn() {
        System.out.println("\n--- [SYSTEM DIAGNOSTICS: POWER] ---");
        
        // Safety Check: Ensure the laptop actually has a charger associated
        if (myCharger != null) {
            System.out.println("Device Brand   : " + this.brand);
            
            // ACCESSING ASSOCIATED OBJECT DATA:
            // Reaching into the Charger object using the 'myCharger' pointer
            System.out.println("Power Source   : " + myCharger.type);
            System.out.println("Current Input  : " + myCharger.wattage + " Watts");
            System.out.println("Battery Status : Charging... [AC POWER DETECTED]");
        } else {
            System.out.println("Alert: No power source detected. Running on internal battery.");
        }
        System.out.println("-----------------------------------\n");
    }
}

class OneToOneTech {
    public static void main(String[] args) {
        System.out.println(">> [LOG] Initializing Hardware Association Test...");

        // 1. Create the independent 'Charger' object
        Charger usbC = new Charger("Type-C PD", 65);

        // 2. Create the 'Laptop' object and associate the charger with it
        // The memory address of 'usbC' is passed into the Laptop constructor
        Laptop macbook = new Laptop("Apple MacBook Air", usbC);

        // 3. Utilize the association to execute a function
        macbook.powerOn();

        System.out.println(">> [LOG] Test Complete. Hardware synced.");
    }
}
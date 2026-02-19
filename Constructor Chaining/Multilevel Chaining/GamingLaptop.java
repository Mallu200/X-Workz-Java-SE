class Device {
    Device() {
        System.out.println("Step 1: Device (Grandparent) Initialized");
    }
}

class Laptop extends Device {
    Laptop(String brand) {
        // Implicitly calls super() of Device
        System.out.println("Step 2: Laptop (Parent) Initialized for: " + brand);
    }
}

class GamingLaptop extends Laptop {
    GamingLaptop(String brand, String gpu) {
        super(brand); // Calls Laptop constructor
        System.out.println("Step 3: GamingLaptop (Child) Initialized with GPU: " + gpu);
    }

    public static void main(String args[]) {
        System.out.println("--- Booting up Gaming Rig ---");
        GamingLaptop myRig = new GamingLaptop("Alienware", "RTX 4090");
    }
}
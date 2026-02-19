class Sensor {
    // --- INSTANCE INITIALIZER BLOCK ---
    // Rule: This block executes for every single 'new' object created.
    // Use Case: Hardware calibration or common setup logic.
    {
        System.out.println(">> [HARDWARE] Instance Block: Calibrating sensors...");
        System.out.println(">> [HARDWARE] Instance Block: Voltage check... OK.");
        System.out.println("----------------------------------------------");
    }

    // --- CONSTRUCTOR ---
    Sensor(String type) {
        System.out.println(">> [STATUS] Constructor: " + type + " sensor is now online.");
    }

    public static void main(String args[]) {
        System.out.println(">> [SYSTEM] Booting Sensor Hub...");

        // Creating the first sensor
        new Sensor("Smoke Detector");

        // Creating a second sensor
        // The instance block will run again automatically!
        new Sensor("Temperature Monitor");
    }
}
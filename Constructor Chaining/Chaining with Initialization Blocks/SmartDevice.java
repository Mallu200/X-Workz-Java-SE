class SmartDevice {
    String deviceName;
    String status;

    // Instance Initialization Block
    // Logic: Mandatory network check for every device
    {
        System.out.println(">> [NETWORK] Scanning for Wi-Fi signal...");
        System.out.println(">> [NETWORK] Connection Stable. Signal: Strong.");
        this.status = "OFFLINE"; // Default state until constructor finishes
    }

    // Constructor 1: Custom device name and initial state
    SmartDevice(String name, String initialState) {
        this.deviceName = name;
        this.status = initialState;
        System.out.println("Constructor: Registering '" + name + "' as " + initialState);
    }

    // Constructor 2: Default device (Chains to Constructor 1)
    SmartDevice(String name) {
        this(name, "STANDBY");
        System.out.println("Constructor: Applied default STANDBY mode.");
    }

    void showStatus() {
        System.out.println("Device Info -> Name: " + deviceName + " | Current Status: " + status);
    }

    public static void main(String args[]) {
        System.out.println("--- Adding New Device: Living Room ---");
        SmartDevice light = new SmartDevice("Smart Bulb", "ON");
        light.showStatus();

        System.out.println("\n--- Adding New Device: Kitchen ---");
        SmartDevice fan = new SmartDevice("Exhaust Fan");
        fan.showStatus();
    }
}
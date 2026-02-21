interface SmartDevice {
    void turnOn();

    // Default: Provides a standard behavior for all devices
    default void enableSleepMode() {
        System.out.println("Device: Power saving mode enabled."); // Default power saving logic
    }
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Light: Bulb is shining."); // Light-specific logic
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        light.turnOn();
        light.enableSleepMode(); // Using the interface's default sleep logic
    }
}
@FunctionalInterface
interface SmartDevice {
    void operate();
    // void charge(); // Un-commenting this will cause a Compiler Error!
}

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice lamp = () -> System.out.println("Lamp is now ON.");
        lamp.operate();
    }
}
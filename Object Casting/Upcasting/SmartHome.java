class Device {
    void turnOff() {
	System.out.println("Device power cut."); }
}

class Bulb extends Device {
    void turnOff() {
	System.out.println("Bulb light faded out."); }
}

class SmartHome {
    public static void main(String[] args) {
        // Upcasting: Bulb is treated as a Device
        Device d = new Bulb();
        d.turnOff();
    }
}
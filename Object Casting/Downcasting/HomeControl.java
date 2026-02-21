class Device {
    void powerOn() {
		System.out.println("Device is ON."); }
}
class SmartBulb extends Device {
    void changeColor(String color) { 
		System.out.println("Bulb color changed to " + color); }
}

class HomeControl {
    public static void main(String[] args) {
        Device d = new SmartBulb(); // Upcasting
        
        // Downcasting to access color controls
        SmartBulb bulb = (SmartBulb) d;
        bulb.changeColor("Red");
    }
}
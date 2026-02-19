class SmartDevice {
    String deviceName = "Living Room AC";
    boolean isOn = false;
}

class HomeAutomation {
    // Parameter 'device' is the object being controlled
    static void togglePower(SmartDevice device) {
        System.out.println("Method togglePower started");
        
        device.isOn = true;
        System.out.println(device.deviceName + " power status: " + device.isOn);
        
        System.out.println("Method togglePower ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        SmartDevice ac = new SmartDevice();
        togglePower(ac);
        System.out.println("Main ended");
    }
}
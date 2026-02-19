class SmartBulb {
    // byte is ideal for a brightness percentage (0-100)
    static byte getBrightness() {
        // Logic: Returns the current dimming level
        return 75; 
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        byte intensity = getBrightness();
        System.out.println("Current Brightness: " + intensity + "%");
        System.out.println("Main ended");
    }
}
class SmartHome {
    // Parameter variable: 'level' defines the brightness percentage
    public static void setBrightness(int level) {
        System.out.println("Setting light brightness to: " + level + "%");
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        // Passing 85 as the brightness level
        setBrightness(85);

        System.out.println("Main ended");
    }
}
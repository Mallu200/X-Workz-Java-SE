class Thermometer {
    // float is ideal for simple medical readings
    static float getBodyTemperature() {
        // Logic: Returns temp in Celsius
        return 36.6f; // Suffix 'f' is mandatory
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        float temp = getBodyTemperature();
        System.out.println("Patient Temperature: " + temp + "°C");
        System.out.println("Main ended");
    }
}
class TemperatureSensor {
    // float[] is efficient for a series of sensor readings
    static float[] getRecentReadings() {
        // Logic: Returns last three temperatures in Celsius
        return new float[]{24.5f, 25.0f, 25.2f};
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        float[] logs = getRecentReadings();
        System.out.println("Latest Temp: " + logs[2] + "°C");
        System.out.println("Main ended");
    }
}
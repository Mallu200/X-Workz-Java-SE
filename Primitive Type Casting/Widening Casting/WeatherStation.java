class WeatherStation {
    public static void main(String[] args) {
        float currentTemp = 36.6f;
        double precisionTemp = currentTemp; // Widening (Automatic)

        System.out.println("Sensor Reading: " + currentTemp);
        System.out.println("System Storage: " + precisionTemp);
    }
}
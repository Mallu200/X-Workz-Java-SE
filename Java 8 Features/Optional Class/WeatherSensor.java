import java.util.Optional;

class WeatherSensor {
    public static void main(String[] args) {
        Double sensorReading = 0.5; // Rain detected

        Optional<Double> rain = Optional.ofNullable(sensorReading);

        // Maps the value to a string if present
        String status = rain.map(r -> "Raining: " + r + "mm").orElse("Clear Skies");

        System.out.println("Status: " + status);
    }
}
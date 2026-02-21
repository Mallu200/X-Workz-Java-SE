import java.time.LocalTime;

class FlightTracker {
    public static void main(String[] args) {
        LocalTime takeoff = LocalTime.of(10, 00); // 10:00 AM
        LocalTime arrival = takeoff.plusHours(5).plusMinutes(30);

        // Single line comment: Adds travel duration to the takeoff time
        System.out.println("Expected landing at: " + arrival);
    }
}
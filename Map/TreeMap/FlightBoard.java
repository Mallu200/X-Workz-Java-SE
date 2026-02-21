import java.util.TreeMap;

class FlightBoard {
    public static void main(String[] args) {
        TreeMap<String, String> flights = new TreeMap<>();

        flights.put("AI-202", "Delayed");
        flights.put("BA-101", "On Time");
        flights.put("EK-505", "Boarding");

        System.out.println("Sorted Flight Board: " + flights);
    }
}
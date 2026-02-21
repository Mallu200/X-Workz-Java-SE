import java.util.LinkedHashMap;

class DeliveryRoute {
    public static void main(String[] args) {
        LinkedHashMap<String, String> route = new LinkedHashMap<>();

        route.put("123 Main St", "Box 1 of 2");
        route.put("456 Oak Ave", "Envelope");
        route.put("789 Pine Rd", "Heavy Parcel");

        for (String stop : route.keySet()) {
            System.out.println("Driving to: " + stop + " to deliver: " + route.get(stop));
        }
    }
}
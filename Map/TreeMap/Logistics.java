import java.util.TreeMap;

class Logistics {
    public static void main(String[] args) {
        TreeMap<Integer, String> schedule = new TreeMap<>();

        schedule.put(900, "Warehouse A");
        schedule.put(1400, "Office Complex");
        schedule.put(1100, "Retail Store");

        // TreeMap specific: Find all deliveries before 12:00
        System.out.println("Morning Deliveries: " + schedule.headMap(1200));
    }
}
import java.util.LinkedList;

class GPSRoute {
    public static void main(String[] args) {
        LinkedList<String> coordinates = new LinkedList<>();

        coordinates.add("Point A (Start)");
        coordinates.add("Point B (Destination)");

        // Insert a stop at index 1
        coordinates.add(1, "Point C (Gas Station)");

        for(String point : coordinates) {
            System.out.println("Next stop: " + point);
        }
    }
}
import java.util.LinkedHashSet;

class Breadcrumbs {
    public static void main(String[] args) {
        LinkedHashSet<String> path = new LinkedHashSet<>();

        path.add("Home");
        path.add("Categories");
        path.add("Smartphones");
        path.add("Home"); // User returned to home, but we keep the unique sequence

        System.out.println("Navigation Path: " + String.join(" > ", path));
    }
}
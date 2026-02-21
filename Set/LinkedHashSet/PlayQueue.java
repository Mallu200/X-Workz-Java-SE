import java.util.LinkedHashSet;

class PlayQueue {
    public static void main(String[] args) {
        LinkedHashSet<String> queue = new LinkedHashSet<>();

        queue.add("Song A");
        queue.add("Song B");
        queue.add("Song A"); // Duplicate ignored, but Song B stays in its place

        System.out.println("Up Next: " + queue);
    }
}
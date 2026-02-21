import java.util.LinkedList;

class PhotoAlbum {
    public static void main(String[] args) {
        LinkedList<String> photos = new LinkedList<>();

        photos.add("Beach_Day.jpg");
        photos.add("Party.png");

        // Adding at the start is O(1) - very fast!
        photos.addFirst("New_Year_2024.jpg");

        System.out.println("First Photo: " + photos.peekFirst());
    }
}
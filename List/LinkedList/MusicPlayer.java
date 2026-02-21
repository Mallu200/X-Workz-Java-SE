import java.util.LinkedList;

class MusicPlayer {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Bohemian Rhapsody");
        playlist.add("Stairway to Heaven");
        playlist.add("Hotel California");

        // Efficient removal from the middle (no shifting needed internally)
        playlist.remove("Stairway to Heaven");

        System.out.println("Next Song: " + playlist.get(1)); 
    }
}
import java.util.ArrayList;

class MusicPlaylist {
    public static void main(String[] args) {
        ArrayList<String> playlist = new ArrayList<>();

        playlist.add("Shape of You");
        playlist.add("Blinding Lights");

        // Checking if a song exists
        if (playlist.contains("Blinding Lights")) {
            System.out.println("Song is already in the playlist.");
        }

        // Finding the position of a song
        int position = playlist.indexOf("Shape of You");
        System.out.println("Position of 'Shape of You': " + position);
    }
}
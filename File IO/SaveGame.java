import java.io.*;

class Player implements Serializable {
    String name; int level;
    Player(String n, int l) { this.name = n; this.level = l; }
}

public class SaveGame {
    public static void main(String[] args) {
        Player p1 = new Player("Hero", 50);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("save.dat"))) {
            // Converts the object into a byte stream for storage
            out.writeObject(p1);
            System.out.println("Game Saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
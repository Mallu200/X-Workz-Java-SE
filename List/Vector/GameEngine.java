import java.util.Vector;

class GameEngine {
    public static void main(String[] args) {
        Vector<String> entities = new Vector<>();

        entities.add("Enemy_Orc_1");
        entities.add("Player_Warrior");

        // Checking capacity (How much memory is actually allocated)
        System.out.println("Memory Capacity: " + entities.capacity());
    }
}
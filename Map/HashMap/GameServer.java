import java.util.HashMap;

class GameServer {
    public static void main(String[] args) {
        HashMap<String, Integer> scoreBoard = new HashMap<>();

        scoreBoard.put("PlayerOne", 1500);
        scoreBoard.put("ProGamer99", 3200);

        // Check if a player exists before adding
        if (!scoreBoard.containsKey("Newbie")) {
            scoreBoard.put("Newbie", 0);
        }

        System.out.println("Current Scores: " + scoreBoard);
    }
}
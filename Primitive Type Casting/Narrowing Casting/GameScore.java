class GameScore {
    public static void main(String[] args) {
        float preciseScore = 998.75f;
        int displayScore = (int) preciseScore; // Manual Narrowing

        System.out.println("Precise Score: " + preciseScore);
        System.out.println("Leaderboard Score: " + displayScore); // Output: 998
    }
}
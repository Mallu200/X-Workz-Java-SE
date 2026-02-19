class ArcadeGame {
    // int[] returns a collection of whole numbers
    static int[] getTopScores() {
        // Logic: Returns the top three scores from the server
        int[] scores = {9800, 8500, 7200};
        return scores;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        int[] leaderboard = getTopScores();
        System.out.println("High Score: " + leaderboard[0]);
        System.out.println("Main ended");
    }
}
class GameEngine {
    // byte is used for small level counters
    static byte getCurrentStage() {
        // Logic: Returns the current mission number
        return 12;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        byte stage = getCurrentStage();
        System.out.println("Player is on Stage: " + stage);
        System.out.println("Main ended");
    }
}
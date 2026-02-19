class Game {
    public static void main(String[] args) {
        System.out.println("Main started");

        // Local variable: Exists only while the 'jump' logic is running
        int jumpHeight = 10;
        
        System.out.println("Character is jumping...");
        System.out.println("Current Elevation: " + jumpHeight + " units");

        System.out.println("Main ended");
    }
}
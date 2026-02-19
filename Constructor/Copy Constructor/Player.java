class Player {
    String skin;
    int level;

    // Standard Parameterized Constructor
    Player(String skin, int level) {
        System.out.println("Standard Constructor: Creating original player...");
        this.skin = skin;
        this.level = level;
    }

    // Copy Constructor: Takes an object of the SAME class as a parameter
    Player(Player deadPlayer) {
        System.out.println("Copy Constructor: Respawning from " + deadPlayer.skin + "...");
        if (deadPlayer != null) {
            // Copying data from the old object to the new 'this' object
            this.skin = deadPlayer.skin;
            this.level = deadPlayer.level;
        }
    }
	
    void showStats() {
        System.out.println("Skin: " + skin + " | Level: " + level);
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // Step 1: Create the first player (Original)
        Player p1 = new Player("Cyber-Knight", 45);
        
        // Step 2: Use p1 to create p2 (Copy)
        // p2 is a NEW object in memory, but with p1's data
        Player p2 = new Player(p1); 
		
        System.out.println("\n--- Comparison ---");
        p1.showStats();
        p2.showStats();	
        
        System.out.println("Main ended");
    }
}
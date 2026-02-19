class Player {
    int level;
    int health;
    String weapon;

    // No-Argument Constructor
    // Logic: Defines the "Starting Stats" for every new player
    Player() {
        System.out.println("Constructor Player() started");
        
        level = 1;
        health = 100;
        weapon = "Wooden Sword";
        
        System.out.println("Character Spawned! Level: " + level);
        System.out.println("Constructor Player() ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        // Creating the 'hero' object triggers the spawning logic
        Player hero = new Player();
        
        // Confirming the starter pack
        System.out.println("Current Weapon: " + hero.weapon);
        System.out.println("Health Status: " + hero.health + "%");
        
        System.out.println("Main method ended");
    }
}
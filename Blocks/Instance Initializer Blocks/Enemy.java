class Enemy {
    // --- INSTANCE INITIALIZER BLOCK ---
    // Rule: This is the 'Pre-Spawn' logic. 
    // It runs for every single enemy instance before their specific stats are set.
    {
        System.out.println(">> [AUDIO] Instance Block: Playing 'Spawn' sound effect...");
        System.out.println(">> [GFX] Instance Block: Rendering spawn particle effects...");
        System.out.println("-----------------------------------------------------");
    }

    // Constructor 1: Default (Weak Enemy)
    Enemy() { 
        System.out.println(">> [LOG] Constructor: Spawned a weak grunt (Basic AI)."); 
    }

    // Constructor 2: Parameterized (Boss Enemy)
    Enemy(int level) { 
        System.out.println(">> [LOG] Constructor: Spawned a level " + level + " Boss (Elite AI)."); 
    }

    public static void main(String args[]) {
        System.out.println("--- Battle Start: Wave 1 ---");
        
        // Spawn 1: Uses the No-Arg Constructor
        new Enemy();

        System.out.println("\n--- Boss Music Starts ---");
        
        // Spawn 2: Uses the Overloaded Constructor
        new Enemy(50);
    }
}
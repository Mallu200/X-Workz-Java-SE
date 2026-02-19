class GameEngine {

    // --- STATIC BLOCK ---
    // Rule: Runs ONLY ONCE when the class is loaded by the JVM.
    // Use Case: Heavy resource loading (Graphics, Sound, Physics).
    static {
        System.out.println(">> [CORE] Static Block: Loading 4K Textures (5GB)...");
        System.out.println(">> [CORE] Static Block: Initializing Audio Engine (Spatial Sound)...");
        System.out.println(">> [CORE] System Ready.");
        System.out.println("--------------------------------------------------");
    }

    // --- CONSTRUCTOR ---
    // Rule: Runs EVERY TIME a new object ('new') is created.
    // Use Case: Initializing specific instance data.
    GameEngine() {
        System.out.println(">> [SPAWN] Constructor: New Player spawned in the world.");
    }

    public static void main(String args[]) {
        System.out.println(">> [MAIN] Main Method: Game Started.");
        
        // Creating first player
        new GameEngine();
        
        // Creating second player
        new GameEngine();
        
        System.out.println(">> [MAIN] Total Players in Map: 2");
    }
}
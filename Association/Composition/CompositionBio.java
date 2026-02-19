class Heart {
    // The child has no meaning outside the parent in this model.
    void beat() {
        System.out.println(">> [BIOLOGY] Rhythm Check: Heart is pumping blood... Lub-Dub.");
    }
}

class Human {
    String name;
    
    // --- STEP 1: ENCAPSULATION & OWNERSHIP ---
    // In Composition, we often use 'private' and 'final' to ensure 
    // the internal part cannot be replaced or accessed directly from outside.
    private final Heart heart; 

    // --- STEP 2: INTERNAL INSTANTIATION ---
    // The parent 'owns' the 'new' keyword. The child's life starts 
    // the exact moment the parent's life starts.
    Human(String name) {
        this.name = name;
        this.heart = new Heart(); // COMPOSITION: Child is created INSIDE.
        System.out.println(">> [VITAL-SIGNS] Human '" + name + "' initialized with integrated biological systems.");
    }

    void live() {
        System.out.println("\n--- [BIOLOGICAL STATUS REPORT] ---");
        System.out.println("Entity Name : " + this.name);
        
        // The parent delegates a task to its internal part
        heart.beat(); 
        
        System.out.println("System Check: All vitals are functional.");
        System.out.println("----------------------------------\n");
    }
}

class CompositionBio {
    public static void main(String[] args) {
        System.out.println(">> [SYS] Initiating Biological Lifecycle Simulation...");

        // 1. Creation of the Parent
        // Notice we do NOT create a Heart in main. It is not our responsibility.
        Human h1 = new Human("Karan");
        
        // 2. Accessing the system
        h1.live();

        // 3. THE STRONG LINK TEST:
        // When we set 'h1' to null, the only reference to the Heart object 
        // (which was stored inside h1.heart) is lost forever.
        System.out.println(">> [ACTION] Termination: Human object 'h1' set to NULL.");
        h1 = null; 

        // 4. Verification
        // There is no way to call 'heart.beat()' anymore. 
        // The Heart is now "dead" to the program and will be swept by the Garbage Collector.
        System.out.println(">> [GC] Garbage Collector will now reclaim both Human and Heart memory.");
        
        System.out.println(">> [SYS] Simulation Ended.");
    }
}
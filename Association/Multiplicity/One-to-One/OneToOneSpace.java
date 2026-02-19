class SpaceSuit {
    String suitSerial;
    boolean isOxygenFull;

    // --- STEP 1: INDEPENDENT INSTANTIATION ---
    // The suit exists even if no astronaut is currently wearing it.
    SpaceSuit(String serial) {
        this.suitSerial = serial;
        this.isOxygenFull = true;
        System.out.println(">> [NASA-LOG] Memory Allocated: SpaceSuit " + serial + " is pressurized.");
    }
}

class Astronaut {
    String name;
    
    // --- STEP 2: ONE-TO-ONE ASSOCIATION ---
    // This is the link. The Astronaut class 'has-a' reference to a SpaceSuit object.
    SpaceSuit suit;

    // Constructor: Passing the reference (Object Injection)
    Astronaut(String name, SpaceSuit suit) {
        this.name = name;
        
        // The association is established here by assigning the memory address
        this.suit = suit; 
        System.out.println(">> [MISSION-CONTROL] Link Established: " + name + " <-> " + suit.suitSerial);
    }

    void performEVA() {
        System.out.println("\n--- [EXTERNAL VEHICULAR ACTIVITY LOG] ---");
        
        // Safety Check: Avoid NullPointerException if no suit is linked
        if (this.suit != null) {
            System.out.println("Personnel Name    : " + this.name);
            
            // ACCESSING ASSOCIATED OBJECT DATA:
            // Reaching into the SpaceSuit memory block via the 'suit' variable
            System.out.println("Active Equipment  : " + suit.suitSerial);
            System.out.println("Life Support      : " + (suit.isOxygenFull ? "OPTIMAL (100%)" : "CRITICAL"));
            System.out.println("Current Task      : Performing Spacewalk...");
        } else {
            System.out.println("ALERT: Cannot perform EVA without an associated SpaceSuit!");
        }
        System.out.println("------------------------------------------\n");
    }
}

class OneToOneSpace {
    public static void main(String[] args) {
        System.out.println("--- [INITIALIZING NASA PRE-LAUNCH PROTOCOL] ---");

        // 1. Create the 'independent' object (The Equipment)
        SpaceSuit markV = new SpaceSuit("EVA-99");

        // 2. Create the 'dependent' object (The Personnel) and link the equipment
        // We pass 'markV' as an argument to associate it with the commander
        Astronaut commander = new Astronaut("Neil Armstrong", markV);

        // 3. Utilize the association to perform a task
        commander.performEVA();

        System.out.println("--- [MISSION SUCCESSFUL: LOG CLOSED] ---");
    }
}
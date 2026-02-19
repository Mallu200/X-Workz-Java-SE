class Room {
    String type;
    
    // The Room is a 'Part' that has no lifecycle outside the 'Whole'.
    Room(String type) {
        this.type = type;
        System.out.println(">> [BUILDER] Internal Structure: " + type + " floor plan laid out.");
    }
}

class House {
    // --- STEP 1: COMPOSITION (STRONG HAS-A) ---
    // The Room reference is marked private to ensure it is only 
    // accessible through the House 'Whole'.
    private final Room livingRoom; 

    // --- STEP 2: INTERNAL CREATION ---
    // The 'Whole' (House) is responsible for creating its 'Parts' (Rooms).
    // The Room object is instantiated directly inside the House constructor.
    House() {
        this.livingRoom = new Room("Modern Living Room");
        System.out.println(">> [CONSTRUCTION] House construction finalized with internal rooms.");
    }

    void status() {
        System.out.println("\n--- [PROPERTY REPORT] ---");
        if (livingRoom != null) {
            // Reaching into the composed object
            System.out.println("Feature : " + livingRoom.type);
            System.out.println("Status  : Occupiable and Integrated.");
        }
        System.out.println("--------------------------\n");
    }
}

class CompositionHome {
    public static void main(String[] args) {
        System.out.println(">> [SYS] Loading Residential Blueprint...");

        // 1. Create the Parent (House)
        // Notice: 'Room' is never instantiated in the main method.
        House myHome = new House();
        
        // 2. Access the property
        myHome.status();

        // 3. THE STRONG LINK TEST:
        // By setting myHome to null, the House object is gone.
        // Since livingRoom was a reference inside that House object, 
        // there is now ZERO way to access that specific Room in memory.
        System.out.println(">> [ACTION] Demolishing the House (Setting to NULL)...");
        myHome = null; 

        // 4. Verification
        // The Room dies with the House. This is the hallmark of Composition.
        System.out.println(">> [GC] House and its internal Rooms are now marked for total deletion.");
        
        System.out.println(">> [SYS] Site cleared.");
    }
}
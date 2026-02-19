class Mouse {
    String type;

    // --- STEP 1: INDEPENDENT COMPONENT ---
    // The mouse exists as a standalone peripheral before being connected.
    Mouse(String type) {
        this.type = type;
        // Mandatory SOP to trace the peripheral's lifecycle
        System.out.println(">> [HARDWARE-LOG] Mouse Manufactured: " + type);
    }
}

class Computer {
    String cpu;
    
    // --- STEP 2: AGGREGATION (HAS-A) ---
    // The Computer has a reference to a Mouse object.
    // This is a "Weak" connection because the Computer does not 'own' the Mouse's memory.
    Mouse externalMouse; 

    // Constructor: Receiving the peripheral via Object Injection
    Computer(String cpu, Mouse m) {
        this.cpu = cpu;
        
        // Linking the external object to our internal reference variable
        this.externalMouse = m; 
        System.out.println(">> [OS-BOOT] Hardware detected: " + cpu + " system paired with " + m.type + " mouse.");
    }

    void status() {
        System.out.println("\n--- [WORKSTATION DIAGNOSTICS] ---");
        
        // Logic Check: Verify the associated object is available
        if (externalMouse != null) {
            System.out.println("Processor Unit : " + this.cpu);
            
            // Accessing the state of the aggregated Mouse object
            System.out.println("Input Device   : " + externalMouse.type);
            System.out.println("Link Status    : Peripheral active and syncing.");
        } else {
            System.out.println("Warning: System running without a primary input device.");
        }
        System.out.println("---------------------------------\n");
    }
}

class AggregationTech {
    public static void main(String[] args) {
        System.out.println(">> [SYSTEM] Starting Hardware Association Test...");

        // 1. Create the Child object independently
        // This 'logitech' object lives in the Heap, independent of any computer.
        Mouse logitech = new Mouse("Gaming RGB");

        // 2. Create the Parent object and "inject" the child
        Computer pc = new Computer("Intel i9", logitech);
        
        // 3. Utilize the link
        pc.status();

        // 4. WEAK LINK TEST: Destroy the Parent
        System.out.println(">> [ACTION] Decommissioning the Computer...");
        pc = null; 

        // 5. Verification of Independence
        // The Computer object is gone, but the Mouse object is still alive in memory
        // because the 'logitech' reference in main still points to it.
        System.out.println(">> [CHECK] Peripheral Status: " + logitech.type + " mouse is still available for other systems.");
        
        System.out.println(">> [SYSTEM] Hardware test concluded.");
    }
}
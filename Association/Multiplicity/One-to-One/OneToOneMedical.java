class Pacemaker {
    String model;
    int batteryLevel;

    // --- STEP 1: CONSTRUCTOR ---
    // Initializes the standalone medical device
    Pacemaker(String model) {
        this.model = model;
        this.batteryLevel = 100; // Defaulting to full charge
        System.out.println(">> [FACTORY] Memory Allocated: Pacemaker " + model + " created.");
    }
}

class Heart {
    String bloodType;
    
    // --- STEP 2: THE ASSOCIATION LINK ---
    // A reference variable of another class type. 
    // This 'has-a' relationship connects the Heart to a Pacemaker.
    Pacemaker device; 

    // Constructor: Here we "Inject" the association
    Heart(String bloodType, Pacemaker device) {
        this.bloodType = bloodType;
        
        // Linking the Heart instance to the Pacemaker instance provided in main
        this.device = device; 
        System.out.println(">> [SURGERY] Procedure Started: Linking Heart to " + device.model);
    }

    void monitorPulse() {
        System.out.println("\n--- [REAL-TIME TELEMETRY] ---");
        
        // Mandatory Safety Check: Ensure the associated object actually exists
        if (device != null) {
            System.out.println("Organ Profile     : " + this.bloodType + " Blood Type");
            
            // ACCESSING ASSOCIATED DATA:
            // We 'reach into' the Pacemaker object via the 'device' reference
            System.out.println("Assigned Device   : " + device.model);
            System.out.println("Power Remaining   : " + device.batteryLevel + "%");
            System.out.println("Connection Status : Syncing Pulse... [STABLE]");
        } else {
            System.out.println("Alert: No supporting device detected. Relying on natural rhythm.");
        }
        System.out.println("-----------------------------\n");
    }
}

class OneToOneMedical {
    public static void main(String[] args) {
        System.out.println(">> [SYSTEM] Booting Medical Monitoring Framework...");

        // 1. Create the independent object (The Device)
        // In Association, the life of this object is independent of the Heart
        Pacemaker p1 = new Pacemaker("Medtronic-X5");

        // 2. Create the dependent object and 'pass' the reference
        // This 'passes' the address of p1 to the Heart's constructor
        Heart patientHeart = new Heart("O-Positive", p1);

        // 3. Utilize the Association
        // The Heart uses the Pacemaker's data to generate a report
        patientHeart.monitorPulse();

        System.out.println(">> [SYSTEM] Log Recorded. Monitoring Session Ended.");
    }
}
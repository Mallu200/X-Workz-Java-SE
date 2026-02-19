class Passenger {
    String pName;

    // --- STEP 1: CONSTRUCTOR ---
    // Passengers are independent travelers registered in the global travel system.
    Passenger(String name) {
        this.pName = name;
        // Mandatory SOP to trace the creation of a person object in the system
        System.out.println(">> [PASSPORT-OFFICE] Identity Verified: " + name);
    }
}

class Flight {
    String flightCode;
    
    // --- STEP 2: THE MANY-TO-MANY LINK ---
    // The Flight class 'has-a' manifest (array) of Passenger references.
    // Multiple flights can point to the same Passenger objects (e.g., Connecting flights).
    Passenger[] manifest;

    // Constructor: Establishing the 'Link' via Object Injection
    Flight(String code, Passenger[] list) {
        this.flightCode = code;
        
        // Finalizing association by assigning the array of traveler references
        this.manifest = list;
        System.out.println(">> [AIRLINE-OPS] Manifest generated for " + code + " | Count: " + list.length);
    }

    void showPassengerList() {
        System.out.println("\n--- [OFFICIAL BOARDING MANIFEST: " + flightCode + "] ---");
        
        // Safety Check: Ensure the flight is not empty before printing
        if (manifest != null && manifest.length > 0) {
            // TRAVERSING THE ASSOCIATION:
            // Using a loop to access the shared Passenger objects via the manifest array
            for (Passenger p : manifest) {
                System.out.println("  > Boarding Pass Validated: " + p.pName);
            }
        } else {
            System.out.println("  > Alert: Flight is currently empty (Ferry Flight).");
        }
        System.out.println("----------------------------------------------\n");
    }
}

class ManyToManyAirlines {
    public static void main(String[] args) {
        System.out.println(">> [SYSTEM] Initializing Air Traffic Control Management...");

        // 1. Create the 'Many' (Passengers) as independent traveler objects
        Passenger ps1 = new Passenger("John");
        Passenger ps2 = new Passenger("Sarah");

        // 2. Define the 'Many' set for a specific flight
        // This array stores the memory addresses of ps1 and ps2
        Passenger[] travelers = {ps1, ps2};

        // 3. Create the 'Flight' object and associate the passengers with it
        Flight f1 = new Flight("AI-101", travelers);

        // 4. Utilize the association to display flight details
        f1.showPassengerList();

        System.out.println(">> [SYSTEM] Pre-flight checks complete. Gate Closed.");
    }
}
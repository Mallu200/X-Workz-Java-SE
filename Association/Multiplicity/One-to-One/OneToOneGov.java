class AadharCard {
    long uid;
    String dob;

    // --- STEP 1: CONSTRUCTOR ---
    // Represents the independent creation of a legal document record.
    AadharCard(long uid, String dob) {
        this.uid = uid;
        this.dob = dob;
        System.out.println(">> [UIDAI-DATABASE] Record Created: UID " + uid + " is now active.");
    }
}

class Citizen {
    String name;
    
    // --- STEP 2: ONE-TO-ONE ASSOCIATION ---
    // The 'myCard' variable is a reference that will point to an AadharCard object.
    AadharCard myCard;

    // Constructor: Establishing the 'Link' via Object Injection
    Citizen(String name, AadharCard cardReference) {
        this.name = name;
        
        // Linking the Citizen instance to the existing AadharCard instance
        this.myCard = cardReference; 
        System.out.println(">> [GOVT-REGISTRY] Association: Citizen '" + name + "' linked to Aadhar " + myCard.uid);
    }

    void verifyIdentity() {
        System.out.println("\n--- [MINISTRY OF HOME AFFAIRS: IDENTITY CHECK] ---");
        
        // Null Check: Ensuring the association exists before accessing data
        if (myCard != null) {
            System.out.println("Full Name      : " + this.name);
            
            // ACCESSING ASSOCIATED DATA (Cross-Object Navigation):
            // We use the 'myCard' reference to pull 'uid' and 'dob' from the AadharCard object
            System.out.println("Verified UID   : " + myCard.uid);
            System.out.println("Date of Birth  : " + myCard.dob);
            System.out.println("Status         : AUTHENTICATION SUCCESSFUL");
        } else {
            System.out.println("Status: RECORD NOT FOUND (No Associated ID)");
        }
        System.out.println("--------------------------------------------------\n");
    }
}

class OneToOneGov {
    public static void main(String[] args) {
        System.out.println(">> [SYSTEM] Starting Identity Verification Protocol...");

        // 1. Create the 'independent' identity object
        // The card exists as a data record first.
        AadharCard card = new AadharCard(123488889999L, "15-Aug-1947");

        // 2. Create the Citizen and associate the card
        // We pass the 'card' reference into the Citizen constructor
        Citizen c = new Citizen("Bharat Kumar", card);

        // 3. Trigger the method that utilizes the association
        c.verifyIdentity();

        System.out.println(">> [SYSTEM] Session Logged Successfully.");
    }
}
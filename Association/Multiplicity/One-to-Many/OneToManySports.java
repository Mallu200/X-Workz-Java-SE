class Player {
    String pName;
    int jerseyNum;

    // --- STEP 1: CONSTRUCTOR ---
    // Represents the registration of an individual athlete.
    Player(String name, int num) {
        this.pName = name;
        this.jerseyNum = num;
        // Mandatory SOP to track memory allocation for each player
        System.out.println(">> [BCI-BOARD] Player Registered: " + name + " (Jersey #" + num + ")");
    }
}

class CricketTeam {
    String country;
    
    // --- STEP 2: THE ONE-TO-MANY LINK ---
    // The CricketTeam class contains an array of Player references.
    // One Team 'has-a' squad consisting of many Players.
    Player[] squad;

    // Constructor: Assigning the 'Many' (Players) to the 'One' (Team)
    CricketTeam(String country, Player[] squad) {
        this.country = country;
        
        // The association is finalized by linking the local 'squad' pointer 
        // to the array of players created in the main method.
        this.squad = squad;
        System.out.println(">> [TEAM-MGMT] Squad finalized for Team " + country + " (" + squad.length + " players).");
    }

    void displaySquad() {
        System.out.println("\n--- [OFFICIAL TEAM ROSTER: " + country.toUpperCase() + "] ---");
        
        // Safety Check: Verify if the team actually has players associated
        if (squad != null && squad.length > 0) {
            // TRAVERSING THE MANY-SIDE:
            // We iterate through the array to access each Player object's state
            for (Player p : squad) {
                System.out.println("  Jersey #" + p.jerseyNum + " | Name: " + p.pName);
            }
        } else {
            System.out.println("  Alert: No players currently assigned to this squad.");
        }
        System.out.println("----------------------------------------------\n");
    }
}

class OneToManySports {
    public static void main(String[] args) {
        System.out.println(">> [SYS] Initiating Tournament Registration...");

        // 1. Create the 'Many' objects (Players) independently
        Player p1 = new Player("Virat", 18);
        Player p2 = new Player("Rohit", 45);

        // 2. Group the players into an Array (The Squad)
        Player[] teamIndia = {p1, p2};

        // 3. Create the 'One' object (Team) and inject the 'Many' (Squad)
        CricketTeam india = new CricketTeam("India", teamIndia);

        // 4. Utilize the association to display team data
        india.displaySquad();

        System.out.println(">> [SYS] Tournament Data Synced.");
    }
}
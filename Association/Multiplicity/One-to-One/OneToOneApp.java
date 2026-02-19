class Profile {
    String bio;
    String profilePicUrl;

    // --- STEP 1: CONSTRUCTOR ---
    // Represents the creation of the user's personal content.
    Profile(String bio, String url) {
        this.bio = bio;
        this.profilePicUrl = url;
        System.out.println(">> [DATABASE] Memory Allocated: Profile data stored on server.");
    }
}

class User {
    String username;
    
    // --- STEP 2: ONE-TO-ONE ASSOCIATION ---
    // The User class 'has-a' reference to a Profile object.
    // This connects the account holder to their specific page.
    Profile profile;

    // Constructor: Linking the objects (Object Injection)
    User(String user, Profile p) {
        this.username = user;
        
        // Storing the address of the Profile object into the User's reference variable
        this.profile = p; 
        System.out.println(">> [AUTH-SERVICE] User '" + user + "' is now associated with a profile.");
    }

    void displayUserPage() {
        System.out.println("\n--- [FRONT-END RENDER: USER DASHBOARD] ---");
        
        // Null Safety: Check if the profile is linked before rendering UI
        if (profile != null) {
            System.out.println("User Account : @" + this.username);
            
            // ACCESSING ASSOCIATED DATA:
            // The User object navigates to the Profile object to retrieve the Bio and URL
            System.out.println("Biography    : " + profile.bio);
            System.out.println("Avatar URL   : " + profile.profilePicUrl);
            System.out.println("UI Status    : Page rendered successfully.");
        } else {
            System.out.println("UI Status: Profile data missing for @" + this.username);
        }
        System.out.println("------------------------------------------\n");
    }
}

class OneToOneApp {
    public static void main(String[] args) {
        System.out.println(">> [APP-START] Initializing User Creation Flow...");

        // 1. Create the independent 'Profile' object
        // The profile data exists as an object in the Heap memory.
        Profile p = new Profile("Java Developer | Tech Enthusiast", "img_01.png");

        // 2. Create the 'User' object and link the profile
        // We pass the reference 'p' to associate it with the 'dev' user
        User dev = new User("Karan_Coder", p);

        // 3. Call the method that utilizes the association link
        dev.displayUserPage();

        System.out.println(">> [APP-END] User session active.");
    }
}
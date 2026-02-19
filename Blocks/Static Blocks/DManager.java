class DManager {
    // --- STATIC BLOCK ---
    // Rule: This is the 'Foundation'. It runs when the class is first mentioned.
    static {
        System.out.println(">> [DB-INIT] Static Block: Loading JDBC Drivers...");
        System.out.println(">> [DB-INIT] Static Block: Establishing Connection Pool (Max: 50)...");
        System.out.println(">> [DB-INIT] System: Backend ready for connections.");
        System.out.println("--------------------------------------------------");
    }
    
    // --- INSTANCE METHOD ---
    // Rule: Belongs to the object. Only runs when called.
    void login(String username) {
        System.out.println(">> [AUTH] " + username + " logged in successfully.");
    }
    
    public static void main(String[] args) {
        System.out.println(">> [MAIN] Starting User Session Management...");

        // First User
        DManager user1 = new DManager();
        user1.login("Karan_Admin");

        // Second User 
        DManager user2 = new DManager(); 
        // Note: The static block WON'T run again here!
        user2.login("Rahul_Guest");

        System.out.println("--------------------------------------------------");
        System.out.println(">> [MAIN] All users are sharing the SAME connection pool.");
    }
}
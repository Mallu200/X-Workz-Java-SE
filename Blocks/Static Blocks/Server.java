class Server {
    // Static variable to hold the environment name
    static String env;

    // --- STATIC BLOCK ---
    // Perfect for fetching OS-level configurations before the app logic starts
    static {
        System.out.println(">> [SYSTEM] Static Block: Initializing Server Config...");
        
        // Fetching environment variable from the Operating System
        env = System.getenv("ENV_TYPE"); 

        // Null Check: If OS doesn't provide a value, we set a safe default
        if (env == null) {
            env = "Development";
            System.out.println(">> [SYSTEM] Warning: No ENV_TYPE found. Defaulting to 'Development'.");
        } else {
            System.out.println(">> [SYSTEM] Environment Variable found: " + env);
        }
        
        System.out.println(">> [SYSTEM] Server Environment successfully set to: " + env);
        System.out.println("------------------------------------------------------");
    }

    public static void main(String args[]) {
        System.out.println(">> [MAIN] Main Method: Starting App Logic...");
        
        // Example of how the logic changes based on the static block's work
        if (env.equalsIgnoreCase("Production")) {
            System.out.println("LOG: Connecting to secure Production Database...");
        } else {
            System.out.println("LOG: Connecting to local Sandbox Database...");
        }
    }
}
class SoftwareApp {
    // Static variable: Shared by the entire class
    static boolean isLicensed;

    // --- STATIC BLOCK ---
    // Rule 1: Runs ONLY ONCE when the class is loaded.
    // Rule 2: Runs BEFORE the main method.
    // Rule 3: Used to initialize static variables.
    static {
        System.out.println("--- Step 1: Static Block Execution ---");
        System.out.println("LOG: Searching for license.key file...");
        
        // Simulating a license check
        isLicensed = true; 
        
        System.out.println("LOG: License Verified. App is authorized for use.");
        System.out.println("--------------------------------------");
    }

    public static void main(String args[]) {
        System.out.println("--- Step 2: Main Method Execution ---");
        
        if (isLicensed) {
            System.out.println("Launching Application... Welcome User!");
        } else {
            System.out.println("Access Denied: Please activate your software.");
        }
    }
}
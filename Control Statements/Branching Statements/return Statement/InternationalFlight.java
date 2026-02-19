class InternationalFlight {
    public static void main(String args[]) {
        System.out.println("Main started");

        boolean hasPassport = false;

        // BOOLEAN CHECK: The Gatekeeper
        // The '!' operator means "NOT". So this reads: "If NOT hasPassport"
        if (!hasPassport) {
            System.out.println("Error: International travel requires a passport.");
            
            // THE RETURN:
            // This is the "Hard Exit". 
            // The program stops here and never reaches the search logic.
            return; 
        }

        // This area is unreachable if hasPassport is false
        System.out.println("Searching for available flights...");
        
        System.out.println("Main ended");
    }
}
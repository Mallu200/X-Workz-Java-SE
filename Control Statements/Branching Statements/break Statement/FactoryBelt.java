class FactoryBelt {
    public static void main(String args[]) {
        System.out.println("Main started");

        String items[] = {"Good", "Good", "Broken", "Good", "Good"};

        // FOR-EACH LOOP: Scanning items on the conveyor belt
        for (String status : items) {
            
            // LOGIC CHECK: Is the current item defective?
            if (status == "Broken") {
                // When "Broken" is encountered (index 2), this triggers.
                System.out.println("Fault Detected! Stopping the conveyor belt.");
                
                // THE BREAK: The conveyor belt stops completely.
                // Items at index 3 and 4 are never checked or packed.
                break; 
            }
            
            System.out.println("Item Quality: " + status + ". Moving to packing.");
        }

        // Post-break logic (e.g., notifying the supervisor)
        System.out.println("Maintenance required on Belt 1.");

        System.out.println("Main ended");
    }
}
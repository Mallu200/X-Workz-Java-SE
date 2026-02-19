class FireAlarm {
    public static void main(String args[]) {
        System.out.println("Main started");

        int smokeLevels[] = {5, 8, 12, 65, 70, 80}; // Sensor readings

        // FOR-EACH LOOP: Monitoring the environment
        for (int level : smokeLevels) {
            
            // EMERGENCY CHECK: Is the smoke level dangerous?
            if (level > 50) {
                // Once 65 is detected, this block triggers.
                System.out.println("CRITICAL! Smoke Level: " + level);
                System.out.println("Activating Sprinklers. Breaking routine check.");
                
                // THE BREAK: We stop checking the remaining data (70, 80).
                // The priority shifts from 'monitoring' to 'action'.
                break; 
            }
            System.out.println("Safe... Smoke at " + level);
        }

        // The system moves to post-emergency state after the break
        System.out.println("Emergency protocol initiated.");

        System.out.println("Main ended");
    }
}
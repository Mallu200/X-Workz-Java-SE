class PhysicsLab {
    public static void main(String args[]) {
        System.out.println("Main started");

        int temp = 105;

        // IF-ELSE-IF LADDER: Phase State Logic
        // The program checks the temperature against known physical constants.
        if (temp <= 0) {
            // Freezing point threshold
            System.out.println("State: Solid (Ice)");
        } 
        else if (temp > 0 && temp < 100) {
            // The range between freezing and boiling
            System.out.println("State: Liquid (Water)");
        } 
        else {
            // Boiling point threshold (100 and above)
            // Since temp is 105, this block will execute.
            System.out.println("State: Gaseous (Steam)");
        }

        System.out.println("Main ended");
    }
}
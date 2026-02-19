class PhysicsLab {
    // Static variable to store the pre-calculated result
    static double atmosphereFactor;

    // --- STATIC BLOCK ---
    // Perfect for complex mathematical initializations
    static {
        System.out.println(">> [LAB-SYS] Static Block: Calibrating sensors...");
        
        // Local variables used only for calculation (cannot be accessed outside)
        double gravity = 9.8;    // m/s^2
        double pressure = 101.3; // kPa
        
        // Perform the complex math once
        atmosphereFactor = gravity * pressure;
        
        System.out.println(">> [LAB-SYS] Calculation Complete.");
        System.out.println(">> [LAB-SYS] Environment Factor: " + atmosphereFactor);
        System.out.println("--------------------------------------------------");
    }

    public static void main(String args[]) {
        System.out.println(">> [MAIN] Lab Experiment Started.");
        
        // Using the pre-calculated factor directly
        double objectWeight = 50.0;
        double finalForce = objectWeight * atmosphereFactor;
        
        System.out.println("Resulting Force for 50kg: " + finalForce + " Newtons");
    }
}
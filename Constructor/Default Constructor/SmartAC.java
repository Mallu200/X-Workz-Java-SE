class SmartAC {
    int temp;
    String mode;

    // No-Argument Constructor
    // Logic: Ensures the AC doesn't start at 0°C (which would be freezing!)
    SmartAC() {
        System.out.println("Constructor SmartAC() started");
        
        temp = 24; // Default comfortable room temperature
        mode = "Cooling";
        
        System.out.println("AC started at " + temp + "°C in " + mode + " mode.");
        System.out.println("Constructor SmartAC() ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        // Creating the object triggers the initialization logic
        SmartAC ac = new SmartAC();
        
        // Verifying the state
        System.out.println("Current Temperature: " + ac.temp);
        
        System.out.println("Main method ended");
    }
}
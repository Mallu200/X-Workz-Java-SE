class HealthCheck {
    public static void main(String args[]) {
        System.out.println("Main started");

        int bp = 135;

        // IF-ELSE-IF LADDER: Medical Diagnostic Logic
        if (bp < 120) {
            System.out.println("Status: Normal");
        } 
        else if (bp >= 120 && bp <= 139) {
            // Since bp is 135, this condition is TRUE (135 is between 120 and 139)
            System.out.println("Status: Pre-hypertension");
        } 
        else {
            // This runs for any value 140 or higher
            System.out.println("Status: High Blood Pressure (Hypertension)");
        }

        System.out.println("Main ended");
    }
}
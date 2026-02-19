class SystemHealth {
    // STATIC METHOD: storageAlert
    // This method takes an input, evaluates it, and performs an action.
    // It belongs to the class itself, making it a "Global Monitor."
    static void storageAlert(int percentUsed) {
        // Log the monitoring check
        System.out.println("Main started");

        // Logic: Threshold check for system stability
        if (percentUsed > 90) {
            System.out.println("Warning: Disk almost full! (" + percentUsed + "%)");
        } else {
            System.out.println("Storage space is healthy. (" + percentUsed + "%)");
        }
    }

    public static void main(String args[]) {
        // CALLING THE STATIC METHOD:
        // We use ClassName.methodName()
        SystemHealth.storageAlert(95);

        // We can check multiple drives easily
        SystemHealth.storageAlert(45); // Check for external drive

        System.out.println("Main ended");
    }
}
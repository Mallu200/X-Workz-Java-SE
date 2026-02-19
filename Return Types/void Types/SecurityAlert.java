class SecurityAlert {
    // VOID: Acts as a messenger to the user.
    static void notifyIntrusion(String location) {
        System.out.println("!!! SECURITY ALERT !!!");
        System.out.println("Unauthorized access detected at: " + location);
        System.out.println("Authorities have been notified.");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Simply triggering the alert
        notifyIntrusion("Main Server Room");
        
        System.out.println("Main ended");
    }
}
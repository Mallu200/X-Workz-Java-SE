class SecurityManager {
    // String... roles acts as a collection of permission tags
    static void checkPermissions(String... roles) {
        System.out.println("Method checkPermissions started");
        
        System.out.println("Verifying access for roles:");
        for (String role : roles) {
            System.out.println("- Permission granted for: " + role);
        }
        
        System.out.println("Method checkPermissions ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Passing 1 argument
        checkPermissions("ADMIN");
        
        System.out.println("Main ended");
    }
}
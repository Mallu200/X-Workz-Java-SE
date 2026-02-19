class Login {
    // Version 1: One input (Overloaded by Count)
    // Used for ATM or Quick Pin access
    void login(int pin) {
        System.out.println("Method login(int) started");
        
        System.out.println("Login successful via PIN: " + pin);
        
        System.out.println("Method login(int) ended");
    }

    // Version 2: Two inputs (Overloaded by Count and Type)
    // Used for standard Web/App login
    void login(String user, String pass) {
        System.out.println("Method login(String, String) started");
        
        System.out.println("Login successful for user: " + user);
        System.out.println("Accessing dashboard...");
        
        System.out.println("Method login(String, String) ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        Login auth = new Login();
        
        // Matches Version 1 (single integer)
        auth.login(1234);
        
        System.out.println("--------------------");
        
        // Matches Version 2 (two strings)
        auth.login("admin", "secret");
        
        System.out.println("Main method ended");
    }
}
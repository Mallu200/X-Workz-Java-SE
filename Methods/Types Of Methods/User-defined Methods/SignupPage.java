class SignupPage {
    // USER-DEFINED METHOD: isStrong
    // Input: A String (the password)
    // Output: A boolean (true or false)
    static boolean isStrong(String password) {
        // Logic: Returns true if length is 8 or more, otherwise returns false
        return password.length() >= 8;
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        String userPass = "java123";
        
        // Calling the method and storing the true/false answer in 'result'
        boolean result = isStrong(userPass);
        
        System.out.println("Checking password: " + userPass);
        System.out.println("Is password valid? " + result);

        // Usage in a real scenario
        if (!result) {
            System.out.println("Error: Password is too short! Use at least 8 characters.");
        }

        System.out.println("Main ended");
    }
}
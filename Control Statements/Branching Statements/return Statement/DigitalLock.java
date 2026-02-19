class DigitalLock {
    public static void main(String args[]) {
        System.out.println("Main started");

        boolean isFaceRecognized = false;

        // AUTHENTICATION CHECK: The Biometric Gate
        if (isFaceRecognized == false) {
            System.out.println("Face Not Recognized. Lock remains engaged.");
            
            // THE RETURN:
            // This kills the 'main' method right here.
            // The code that physically moves the lock mechanism is NEVER reached.
            return; 
        }

        // TRUSTED ZONE: Only accessible if authentication is successful
        System.out.println("Face ID Verified!");
        System.out.println("Welcome home. Unlocking door...");

        System.out.println("Main ended");
    }
}
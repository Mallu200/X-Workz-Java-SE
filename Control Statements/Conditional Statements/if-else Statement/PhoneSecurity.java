class PhoneSecurity {
    public static void main(String args[]) {
        System.out.println("Main started");

        int savedPin = 1234;
        int enteredPin = 9876;

        // IF-ELSE: Dual-Branch Decision
        // The condition (enteredPin == savedPin) is checked.
        if (enteredPin == savedPin) {
            // Path A: Runs only if the PINs match (True)
            System.out.println("Phone Unlocked.");
        } else {
            // Path B: Runs only if the PINs do NOT match (False)
            System.out.println("Incorrect PIN. Please try again.");
        }

        System.out.println("Main ended");
    }
}
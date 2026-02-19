class CustomerCare {
    public static void main(String args[]) {
        System.out.println("Main started");

        int languageCode = 2;

        // SWITCH: Telephony Routing Logic
        // The integer input acts as a direct "extension number" for the code.
        switch (languageCode) {
            case 1:
                System.out.println("Namaskara! Kannada select madirodrinda dhanyavadagalu.");
                break;
            case 2:
                // Since languageCode is 2, Java skips Case 1 and jumps here.
                System.out.println("Welcome! You have chosen English.");
                break;
            case 3:
                System.out.println("Namaste! Aapne Hindi chuna hai.");
                break;
            default:
                // Error handling for when a user presses a key like 5 or 9
                System.out.println("Invalid input. Please try again.");
        }

        System.out.println("Main ended");
    }
}
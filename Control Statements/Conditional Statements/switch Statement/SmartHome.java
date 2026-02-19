class SmartHome {
    public static void main(String args[]) {
        System.out.println("Main started");

        int mode = 1;

        // SWITCH: Discrete Mode Selection
        // Using an 'int' is extremely efficient for the CPU.
        switch (mode) {
            case 1:
                // If mode is 1, Java jumps here immediately.
                System.out.println("Study Mode: Bright White Lights.");
                break; // Exits the switch
            case 2:
                System.out.println("Cinema Mode: Dimmed Warm Lights.");
                break;
            case 3:
                System.out.println("Party Mode: RGB Pulsing Lights.");
                break;
            default:
                // Fallback for any other number (e.g., 0, 4, 99)
                System.out.println("Standard Mode: Natural Lights.");
        }

        System.out.println("Main ended");
    }
}
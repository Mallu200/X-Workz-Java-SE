class SmartWatch {
    public static void main(String[] args) {
        System.out.println("Main started");

        // Step 1: Allocate space for 5 hours
        int[] steps = new int[5];

        // Step 2: Update steps as the day progresses
        steps[0] = 450;  // Hour 1
        steps[1] = 1100; // Hour 2
        steps[2] = 800;  // Hour 3

        System.out.println("Steps recorded for Hour 2: " + steps[1]);
        System.out.println("Steps for Hour 5: " + steps[4]); // Prints '0' (Default)

        System.out.println("Main ended");
    }
}
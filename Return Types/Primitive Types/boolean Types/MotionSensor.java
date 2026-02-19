class MotionSensor {
    // boolean is used for hardware binary states
    static boolean detectMovement() {
        // Logic: Returns true if infrared heat is detected
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        boolean detected = detectMovement();
        System.out.println("Motion in hallway: " + detected);
        System.out.println("Main ended");
    }
}
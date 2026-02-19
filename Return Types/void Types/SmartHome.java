class SmartHome {
    static boolean isLightOn = false;

    // VOID: Changes the value of a variable but doesn't return a result.
    static void toggleLight() {
        isLightOn = !isLightOn; // Flips true to false or vice versa
        System.out.println("The light has been switched " + (isLightOn ? "ON" : "OFF"));
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Calling the task
        toggleLight(); 
        
        System.out.println("Main ended");
    }
}
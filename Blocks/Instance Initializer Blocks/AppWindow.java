class AppWindow {
    // --- INSTANCE INITIALIZER BLOCK ---
    // Rule: The "Standardizer". It sets the base state for every single instance.
    // Use Case: Resetting UI properties to a default state.
    {
        System.out.println(">> [UI-CORE] Instance Block: Setting coordinates to (0,0)...");
        System.out.println(">> [UI-CORE] Instance Block: Setting Opacity to 1.0 (Opaque)...");
        System.out.println("---------------------------------------------------------");
    }

    // --- CONSTRUCTOR ---
    AppWindow(String theme) {
        System.out.println(">> [THEME-ENG] Constructor: Applying " + theme + " theme.");
        System.out.println(">> [WINDOW] Success: Window is now visible to the user.");
    }

    public static void main(String args[]) {
        System.out.println("--- System: Launching New Application Window ---");
        
        // Creating the window object
        new AppWindow("Dark Mode");
    }
}
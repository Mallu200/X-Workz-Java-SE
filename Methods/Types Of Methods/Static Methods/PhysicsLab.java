class PhysicsLab {
    // STATIC METHOD: toCelsius
    // This is a "Pure Function": same input always gives the same output.
    // It doesn't depend on any variables outside this method.
    static double toCelsius(double fahrenheit) {
        // Formula: (F - 32) * 5/9
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // Calling the static method directly via the Class name
        double boilingF = 212;
        double boilingC = PhysicsLab.toCelsius(boilingF);
        
        System.out.println("Fahrenheit: " + boilingF + "°F");
        System.out.println("Boiling Point in Celsius: " + boilingC + "°C");

        // Testing a freezing point
        System.out.println("Freezing Point: " + PhysicsLab.toCelsius(32) + "°C");

        System.out.println("Main ended");
    }
}
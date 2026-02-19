class WeatherApp {
    // USER-DEFINED METHOD: convert
    // 'static' means we can call it without creating an object
    // 'double' is the Return Type (the type of data it gives back)
    // '(double celsius)' is the Parameter (the input it needs)
    static double convert(double celsius) {
        // Log inside the method to track execution
        System.out.println("Processing conversion for: " + celsius + "°C");
        
        return (celsius * 9 / 5) + 32; // The math logic
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // CALLING the method with the value 30
        double result = convert(30);
        
        System.out.println("Temperature in NY: " + result + "°F");

        // Because it's a method, we can reuse it instantly!
        System.out.println("Temperature in London: " + convert(15) + "°F");

        System.out.println("Main ended");
    }
}
class Weather {
    public static void main(String[] args) {
        System.out.println("Main started");

        // Direct Initialization of a double array
        double[] temperatures = {28.5, 30.2, 31.0, 29.8};

        System.out.println("Current Temp: " + temperatures[0] + "°C");
        System.out.println("Max Recorded: " + temperatures[2] + "°C");

        System.out.println("Main ended");
    }
}
class Netflix {
    // Parameter 1: String movie, Parameter 2: float speed
    static void setPlayback(String movie, float speed) {
        System.out.println("Method setPlayback started");
        
        System.out.println("Now Playing: " + movie);
        System.out.println("Speed set to: " + speed + "x");
        
        System.out.println("Method setPlayback ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Passing arguments: String first, float second
        setPlayback("Inception", 1.5f);
        
        System.out.println("Main ended");
    }
}
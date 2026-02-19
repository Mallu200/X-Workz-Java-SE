class RailwayBooking {
    
    // 1. STATIC VARIABLE: Shared by all passengers (Class level)
    static String trainName = "Shatabdi Express";

    // 2. INSTANCE VARIABLE: Unique to every ticket object (Object level)
    String passengerName;

    // 3. PARAMETER VARIABLE: Input passed into the method ('seatNumber')
    public void confirmBooking(int seatNumber) {
        
        // 4. LOCAL VARIABLE: Temporary data used only inside this method
        String status = "CONFIRMED";

        System.out.println("Booking Status: " + status);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Seat Allocated: " + seatNumber);
        System.out.println("Train: " + trainName);
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        // Creating an object to use Instance Variables
        RailwayBooking ticket1 = new RailwayBooking();
        ticket1.passengerName = "Abhishek";

        // Calling method and passing an argument for the Parameter Variable
        ticket1.confirmBooking(45);

        System.out.println("---------------------------");

        RailwayBooking ticket2 = new RailwayBooking();
        ticket2.passengerName = "Vinay";
        ticket2.confirmBooking(46);

        System.out.println("Main ended");
    }
}
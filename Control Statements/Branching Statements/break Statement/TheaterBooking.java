class TheaterBooking {
    public static void main(String args[]) {
        System.out.println("Main started");

        int seatsAvailable = 5;

        // FOR LOOP: Iterating through 10 people in a queue
        for (int person = 1; person <= 10; person++) {
            
            // LOGIC CHECK: Are we out of seats?
            if (person > seatsAvailable) {
                System.out.println("Seat " + person + ": Sorry, Housefull!");
                
                // THE BREAK STATEMENT: 
                // This stops the entire loop immediately. 
                // We don't check persons 7, 8, 9, or 10.
                break; 
            }
            
            System.out.println("Person " + person + ": Ticket Confirmed.");
        }

        // After the break, the program "jumps" here
        System.out.println("Ticket Counter Closed.");
        
        System.out.println("Main ended");
    }
}
class MovieTicket {
    String movie;
    String seat;

    // Parameterized Constructor
    // Logic: Binds a specific movie title and seat number to a unique ticket object
    MovieTicket(String movie, String seat) {
        System.out.println("Constructor MovieTicket(String, String) started");
        
        this.movie = movie; // 'this' differentiates the class variable from the parameter
        this.seat = seat;
        
        System.out.println("Ticket Booked for " + movie + " at Seat " + seat);
        System.out.println("Constructor MovieTicket(String, String) ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        // Creating a ticket object for a specific show and seat
        MovieTicket t1 = new MovieTicket("Inception", "A-12");
        
        // Verifying the ticket data
        System.out.println("Movie: " + t1.movie);
        
        System.out.println("Main method ended");
    }
}
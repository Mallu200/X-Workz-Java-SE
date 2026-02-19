class IndigoAir {
    public static void main(String args[]) {
        System.out.println("Main started");

        int availableSeats = 2;
        int requestedSeats = 5;

        // IF-ELSE: Inventory Validation
        // This check prevents the system from selling more tickets than the plane has.
        if (requestedSeats <= availableSeats) {
            // Path A: The request is within limits
            System.out.println("Tickets Booked Successfully!");
        } else {
            // Path B: The request exceeds current inventory
            System.out.println("Booking Failed: Not enough seats available.");
        }

        System.out.println("Main ended");
    }
}
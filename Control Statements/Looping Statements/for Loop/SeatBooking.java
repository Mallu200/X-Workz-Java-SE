class SeatBooking {
	public static void main(String[] args) {
		System.out.println("Main started");

		System.out.println("Printing Tickets for Row J: ");
		
		// FOR LOOP:
		// Starts at seat 1, continues until seat 10
		// Increments by 1 each time to cover every seat in the row
		for (int seat = 1; seat <= 10; seat++) {
			// CONCATENATION: Combining the Row letter with the current seat number
			System.out.println("Seat Number: J-" + seat);
		}
		
		System.out.println("All tickets printed.");

		System.out.println("Main ended");
	}
}
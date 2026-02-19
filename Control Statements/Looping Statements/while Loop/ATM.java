class ATM {
	public static void main(String[] args) {
		System.out.println("Main started");

		int attempts = 1; // Initialization
		
		// WHILE LOOP:
		// The condition is checked BEFORE entering the loop.
		// If (attempts <= 3) is false initially, the loop will never run.
		while (attempts <= 3) {
			System.out.println("Enter PIN - Attempt No: " + attempts);
			
			// In real code, we would check the PIN here.
			// If correct, we would use 'break' to exit.
			
			// Increment: Crucial to avoid an infinite loop
			attempts++;
		}
		
		System.out.println("Card Blocked! Too many attempts.");

		System.out.println("Main ended");
	}
}
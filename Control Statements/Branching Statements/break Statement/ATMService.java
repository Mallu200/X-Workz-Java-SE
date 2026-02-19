class ATMService {
	public static void main(String[] args) {
		System.out.println("Main started");

		int correctPin = 1234;
		
		// FOR LOOP: Maximum 3 attempts allowed
		for (int attempt = 1; attempt <= 3; attempt++) {
			System.out.println("Attempt " + attempt + ": Enter PIN");
			
			int enteredPin = 1234; // Simulating correct entry
			
			// SECURITY CHECK: Match the user input
			if (enteredPin == correctPin) {
				System.out.println("PIN Correct. Accessing Account...");
				
				// THE BREAK: Once the PIN is right, we MUST stop the loop.
				// Otherwise, the machine would keep asking for the PIN!
				break; 
			}
		}

		// After the break (or after 3 failed tries), the program continues here
		System.out.println("Session Finished.");
		
		System.out.println("Main ended");
	}
}
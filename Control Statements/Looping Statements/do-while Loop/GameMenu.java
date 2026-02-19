class GameMenu {
	public static void main(String[] args) {
		System.out.println("Main started");

		int choice = 3; // Simulating user input
		
		// DO-WHILE LOOP: Menu-Driven Logic
		// Guaranteed to show the welcome screen at least once
		do {
			System.out.println("--- Welcome to CyberRun ---");
			System.out.println("1. Start New Game");
			System.out.println("2. Settings");
			System.out.println("3. Exit");
			
			// Even though choice is 3, the menu prints once before checking
		} while (choice != 3); 
		
		System.out.println("Closing game... GoodBye!");

		System.out.println("Main ended");
	}
}
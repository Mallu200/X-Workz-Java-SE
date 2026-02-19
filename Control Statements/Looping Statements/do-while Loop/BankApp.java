class BankApp {
	public static void main(String[] args) {
		System.out.println("Main started");

		double balance = 5000.75;
		boolean checkAgain = false;
		
		// DO-WHILE LOOP: Exit-Controlled
		// The code inside 'do' runs immediately before checking any condition.
		do {
			System.out.println("Your current balance is: ₹" + balance);
			
			// In a real app, you might ask "Do you want to check again?" here.
			// Since 'checkAgain' is false, it will stop after this first run.
		} while (checkAgain == true); // Condition is checked HERE at the end
		
		System.out.println("Thank you for using our ATM.");

		System.out.println("Main ended");
	}
}
class WebsiteAccess {
	public static void main (String[] args) {
		System.out.println("Main started");

		int userAge = 16;
		
		// SECURITY GATE: Age Verification
		if (userAge < 18) {
			System.out.println("Access Denied: You must be 18+.");
			
			// THE RETURN STATEMENT:
			// This kills the 'main' method immediately.
			// Java doesn't just skip a line; it leaves the building.
			return; 
		}
		
		// EVERYTHING BELOW IS PROTECTED
		// This will only run if the 'return' above was NOT triggered.
		System.out.println("Welcome to the Dashboard!");
		System.out.println("Loading your private content...");

		System.out.println("Main ended");
	}
}
class Election {
	public static void main(String[] args) {
		System.out.println("Main started");

		int age = 16;
		
		// IF-ELSE: Legal Eligibility Check
		if (age >= 18) {
			// Path A: Executed if the user is 18 or older
			System.out.println("Status: Eligible to vote.");
		} else {
			// Path B: Executed if the user is under 18
			// Dynamic Feedback: 18 - 16 = 2 years
			System.out.println("Status: Not Eligible. Wait for " + (18 - age) + " more years.");
		}

		System.out.println("Main ended");
	}
}
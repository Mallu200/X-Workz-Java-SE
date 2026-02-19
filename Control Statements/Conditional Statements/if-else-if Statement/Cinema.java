class Cinema {
	public static void main(String[] args) {
		System.out.println("Main started");

		int age = 10;
		
		// IF-ELSE-IF LADDER: Pricing Tiers
		if (age < 5) {
			System.out.println("Ticket: Free");
		} 
		else if (age >= 5 && age <= 12) {
			// Since 10 is >= 5 AND <= 12, this block triggers!
			System.out.println("Ticket: Half Price (Child)");
		} 
		else if (age > 12 && age < 60) {
			System.out.println("Ticket: Full Price (Adult)");
		} 
		else {
			// This handles everyone aged 60 and above
			System.out.println("Ticket: Senior Citizen Discount Applied.");
		}

		System.out.println("Main ended");
	}
}
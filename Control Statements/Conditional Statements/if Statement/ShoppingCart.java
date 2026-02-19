class ShoppingCart {
	public static void main(String[] args) {
		System.out.println("Main started");

		double totalBill = 1200.00;
		
		// IF STATEMENT: The Promotion Engine
		// The >= operator means "Greater than or Equal to"
		if (totalBill >= 1000.00) {
			// This block executes because 1200.00 is indeed >= 1000.00
			System.out.println("Success: You are eligible for Free Delivery!");
		}
		
		System.out.println("Proceeding to payment gateway...");

		System.out.println("Main ended");
	}
}
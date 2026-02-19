class SuperMarket {
	public static void main(String[] args) {
		System.out.println("Main started");

		double[] prices = {45.50, 120.00, 30.25, 10.00};
		double total = 0;
		
		// FOR-EACH LOOP: 'price' acts as the current item's cost in each iteration
		for (double price : prices) {
			// ACCUMULATION: Adding the current item price to the running total
			total = total + price;
		}
		
		// Display the metadata (length) and the calculated sum
		System.out.println("Total Item scanned: " + prices.length);
		System.out.println("Total Bill: ₹" + total);

		System.out.println("Main ended");
	}
}
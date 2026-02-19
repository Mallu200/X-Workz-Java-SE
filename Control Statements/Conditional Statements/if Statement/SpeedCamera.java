class SpeedCamera {
	public static void main(String[] args) {
		System.out.println("Main started");

		int speed = 95;
		
		// IF STATEMENT: The Gatekeeper
		// The condition (speed > 80) is evaluated as true or false.
		// Since 95 is greater than 80, the code block below will run.
		if (speed > 80) {
			System.out.println("Alert: Over-speeding detected!");
			System.out.println("Generating e-challan...");
		}
		
		// This line runs regardless of the 'if' statement
		System.out.println("Monitoring continues...");

		System.out.println("Main ended");
	}
}
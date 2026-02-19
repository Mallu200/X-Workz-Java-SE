class FastCharge {
	public static void main(String[] args) {
		System.out.println("Main started");

		// FOR LOOP with Custom Step:
		// Initialization: starts at 0
		// Condition: runs until it hits 100
		// Increment: percentage += 20 (adds 20 to the variable after every round)
		for (int percentage = 0; percentage <= 100; percentage += 20){
			System.out.println("Battery Status: " + percentage + "%");
		}
		
		System.out.println("Battery Fully Charged!");

		System.out.println("Main ended");
	}
}
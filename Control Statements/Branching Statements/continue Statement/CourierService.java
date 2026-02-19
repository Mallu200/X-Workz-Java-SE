class CourierService {
	public static void main(String[] args) {
		System.out.println("Main started");

		// FOR LOOP: The elevator moves from floor 1 to 5
		for (int floor = 1; floor <= 5; floor++) {
			
			// LOGIC CHECK: Is the floor accessible?
			if (floor == 3) {
				System.out.println("Floor 3 is locked. Skipping delivery...");
				
				// THE CONTINUE:
				// The elevator doesn't stop. It ignores the delivery code 
				// below and immediately goes to 'floor++' (Floor 4).
				continue; 
			}
			
			// This line is the "Action". It's skipped only for Floor 3.
			System.out.println("Delivering package to Floor: " + floor);
		}

		System.out.println("Main ended");
	}
}
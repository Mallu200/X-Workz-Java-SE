class WashingMachine {
	public static void main(String[] args) {
		System.out.println("Main started");

		boolean isStillDirty = false;
		
		// DO-WHILE LOOP: Physical Process Logic
		// The machine performs the action (Rinsing) FIRST.
		// It only checks the sensor (isStillDirty) AFTER the work is done.
		do {
			System.out.println("Rinsing clothes with water...");
			
			// Even if isStillDirty is false, it rinses once.
			// This is why your clothes get wet even if they were already clean!
		} while (isStillDirty == true); // Exit-check happens here
		
		System.out.println("Cleaning complete. Starting Dryer.");

		System.out.println("Main ended");
	}
}
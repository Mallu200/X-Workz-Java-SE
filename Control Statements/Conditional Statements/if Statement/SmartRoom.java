class SmartRoom {
	public static void main(String[] args) {
		System.out.println("Main started");

		int brightness = 20; // scale of 0-100
		
		// IF STATEMENT: 
		// The controller evaluates if the current light level is below the threshold.
		if (brightness < 30) {
			// This code only runs if the room is considered "dark"
			System.out.println("Room is dark. Turning on the LED lights.");
		}
		
		// This line executes regardless of the brightness level
		System.out.println("System check complete.");

		System.out.println("Main ended");
	}
}
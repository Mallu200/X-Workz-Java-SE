class Bluetooth {
	public static void main(String[] args) {
		System.out.println("Main started");

		boolean isConnected = false;
		int attempts = 0;
		
		// DO-WHILE LOOP: 
		// We MUST try to connect at least once to see if the device is there.
		do {
			attempts++;
			System.out.println("Connecting to speaker... Attempt: " + attempts);
			
			// Simulating a successful connection on the 2nd try
			if (attempts == 2) {
				isConnected = true; 
			}
			
			// The loop only repeats if isConnected is still false
		} while (isConnected == false);
		
		System.out.println("Connected Successfully!");

		System.out.println("Main ended");
	}
}
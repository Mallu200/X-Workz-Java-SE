class TrafficSignal {
	public static void main(String[] args) {
		System.out.println("Main started");

		String light = "Red";
		
		// SWITCH: Categorical Decision Making
		// The variable 'light' is evaluated once.
		switch (light) {
			case "Red":
				// Java jumps directly here!
				System.out.println("Action: STOP and wait.");
				break; // Stops the execution and exits the switch
				
			case "Yellow":
				System.out.println("Action: SLOW DOWN / Prepare.");
				break;
				
			case "Green":
				System.out.println("Action: GO!");
				break;
				
			default:
				// The "Safety Net" - runs if no cases match
				System.out.println("Blinking: Proceed with caution.");
		}

		System.out.println("Main ended");
	}
}
class PowerMonitor {
	public static void main(String[] args){
		System.out.println("Main started");

		int batteryLevel = 12;
		
		// IF STATEMENT: Condition check
		// The CPU compares the current 'batteryLevel' to the threshold '15'.
		if (batteryLevel < 15) {
			// Because 12 < 15 is TRUE, this specific block executes.
			System.out.println("Warning: Battery low. Please connect charger.");
		}
		
		// This code executes regardless of the battery level.
		System.out.println("System monitoring active...");

		System.out.println("Main ended");
	}
}
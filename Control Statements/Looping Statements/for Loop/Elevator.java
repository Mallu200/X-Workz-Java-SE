class Elevator {
	public static void main(String[] args) {
		System.out.println("Main started");

		System.out.println("Elevator Doors Closing...");
		
		// FOR LOOP Structure:
		// 1. Initialization (int floor = 0): Where the elevator starts
		// 2. Condition (floor <= 5): Keep going as long as floor is 5 or less
		// 3. Increment (floor++): Move up by 1 floor after each stop
		for (int floor = 0; floor <= 5; floor++) {
			System.out.println("Ping! Current Floor: " + floor);
		}
		
		System.out.println("Doors Opening at Level 5.");

		System.out.println("Main ended");
	}
}
class StepTracker {
	public static void main(String[] args) {
		System.out.println("Main started");

		System.out.println("Workout Started!");
		
		// FOR LOOP with Milestone Logic:
		// 1. Initialization: Start at the first big milestone (1000)
		// 2. Condition: Goal is 5000 steps
		// 3. Update: Increment by 1000 (steps += 1000) to skip the small steps
		for (int steps = 1000; steps <= 5000; steps += 1000) {
			System.out.println("Milestone Reached: " + steps + " steps done!");
		}
		
		System.out.println("Daily Goal Achieved!");

		System.out.println("Main ended");
	}
}
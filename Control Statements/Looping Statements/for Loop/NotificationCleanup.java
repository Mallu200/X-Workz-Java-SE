class NotificationCleanup {
	public static void main(String[] args) {
		System.out.println("Main started");

		System.out.println("Clearing your notifications...");
		
		// REVERSE FOR LOOP:
		// 1. Initialization: starts at the highest value (5)
		// 2. Condition: stays true as long as count is 1 or greater (count >= 1)
		// 3. Update: uses count-- to subtract 1 after every round
		for (int count = 5; count >=1; count--) {
			System.out.println("Deleting notification #" + count);
		}
		
		System.out.println("Inbox is now empty.");

		System.out.println("Main ended");
	}
}
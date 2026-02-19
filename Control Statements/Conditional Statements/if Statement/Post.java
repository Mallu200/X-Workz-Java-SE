class Post {
	public static void main(String[] args) {
		System.out.println("Main started");

		boolean isDoubleTapped = true; // State of the user action
		int likes = 150;
		
		// IF STATEMENT: Event Trigger
		// We use '==' to compare the current state to 'true'
		if (isDoubleTapped == true) {
			// This block only runs if the action actually happened
			likes++; // Increment the likes count by 1
			System.out.println("Post Liked! Total Likes: " + likes);
		}
		
		// This happens after the check
		System.out.println("Feed updated.");

		System.out.println("Main ended");
	}
}
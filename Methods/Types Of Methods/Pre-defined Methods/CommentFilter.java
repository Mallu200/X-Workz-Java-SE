class CommentFilter {
	public static void main(String[] args) {
		System.out.println("Main started");

		String userComment = "Click here for a free gift!";
		
		// PRE-DEFINED METHOD: String.contains("target")
		// This returns 'true' if the target sequence is found anywhere in the string.
		// Note: This is case-sensitive! "free" is NOT the same as "FREE".
		if (userComment.contains("free")) {
			System.out.println("Warning: This comment looks like spam.");
		}

		System.out.println("Main ended");
	}
}
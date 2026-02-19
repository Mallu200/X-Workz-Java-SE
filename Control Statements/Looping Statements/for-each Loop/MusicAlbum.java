class MusicAlbum {
	public static void main(String[] args) {
		System.out.println("Main started");

		String[] playlist = {"Believer", "Thunder", "Enemy", "Bones"};
		
		System.out.println("--- Playing Now ---");

		// FOR-EACH LOOP Syntax Breakdown:
		// String : The data type matching the array elements
		// song   : The temporary local variable (placeholder) for the current element
		// playlist : The source array we are traveling through
		for (String song : playlist) {
			// In every round, 'song' holds the next value from the array
			System.out.println("Now Playing: " + song);
		}

		System.out.println("Main ended");
	}
}
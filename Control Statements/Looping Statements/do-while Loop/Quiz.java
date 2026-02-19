class Quiz {
	public static void main(String[] args) {
		System.out.println("Main started");

		int questionsAnswered = 0;
		
		// DO-WHILE LOOP: Task-first approach
		do {
			// Incrementing first: Moving to the next question
			questionsAnswered++; 
			System.out.println("Solving question number: " + questionsAnswered);
			
			// After solving, check if we need to do another one.
			// Round 1: questionsAnswered becomes 1. (1 < 3) is true.
			// Round 2: questionsAnswered becomes 2. (2 < 3) is true.
			// Round 3: questionsAnswered becomes 3. (3 < 3) is false. Loop ends.
		} while (questionsAnswered < 3);
		
		System.out.println("Quiz finished. Total questions: " + questionsAnswered);

		System.out.println("Main ended");
	}
}
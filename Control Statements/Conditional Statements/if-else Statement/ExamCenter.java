class ExamCenter {
	public static void main (String[] args) {
		System.out.println("Main started");

		int marks = 32;
		
		// IF-ELSE: Categorization Logic
		// The condition 'marks >= 35' acts as a filter.
		if (marks >= 35) {
			// Path A: Executed only if marks are 35 or higher
			System.out.println("Congratulations! You have passed.");
		} else {
			// Path B: Executed for any value below 35 (like 32)
			System.out.println("Result: Fail. Better luck next time.");
		}

		System.out.println("Main ended");
	}
}
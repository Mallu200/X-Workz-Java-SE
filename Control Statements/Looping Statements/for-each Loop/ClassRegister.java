class ClassRegister {
	public static void main(String[] args) {
		System.out.println("Main started");

		boolean[] attendance = {true, false, true, true};
		int presentCount = 0;
		
		// FOR-EACH LOOP: Iterates through each element of the 'attendance' array
		// 'status' acts as a temporary variable that holds the value of the current element in each round
		for (boolean status : attendance) {
			
			// If the current element (status) is true, increment the counter
			if (status == true) {
				presentCount++;
			}
		}
		
		System.out.println("Total Students Present: " + presentCount);
		
		System.out.println("Main ended");
	}
}
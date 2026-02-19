class Company {
	// Static variable: Shared memory across the entire class
	static String companyName = "X-Workz";
	
	public static void main(String[] args) {
		System.out.println("Main started");

		System.out.println("Welcome to " + companyName);

		System.out.println("Main ended");
	}
}
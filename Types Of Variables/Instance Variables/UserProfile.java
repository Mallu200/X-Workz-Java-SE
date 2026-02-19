class UserProfile {
	// Instance Variable: Each object created will get its own unique copy
	String personName;
	
	public static void main(String[] args) {
		System.out.println("Main started");

		// Step 1: Instantiate the class (allocates memory in the Heap)
		UserProfile user = new UserProfile();
		
		// Step 2: Assign a value specifically to this 'user' object
		user.personName = "Abhishek";
		
		// Step 3: Access the variable through the specific object reference
		System.out.println("The User Name is: " + user.personName);

		System.out.println("Main ended");
	}
}
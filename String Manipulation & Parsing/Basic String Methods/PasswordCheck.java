class PasswordCheck {
	public static void main(String[] args) {
		String pass = "java123";
		
		int size = pass.length(); // Returns the total count of characters
		
		if (size < 8) {
			System.out.println("Error: Password must be at least 8 characters!");
		} else {
			System.out.println("Password length is acceptable.");
		}
	}
}
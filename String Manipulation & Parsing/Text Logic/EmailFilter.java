class EmailFilter {
	public static void main(String[] args) {
		String email = "student@gmail.com";
		
		// Find the position of '@'
		int atRateIndex = email.indexOf("@");
		
		// Cut from the character AFTER '@' until the end
		String domain = email.substring(atRateIndex + 1);
		
		System.out.println("Email: " + email);
		System.out.println("Domain: " + domain); 
	}
}
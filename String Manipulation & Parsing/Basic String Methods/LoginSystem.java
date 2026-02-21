class LoginSystem {
	public static void main(String[] args) {
		String rawUsername = " user_gemini "; // Spaces at both ends
		
		String cleanUsername = rawUsername.trim();
		
		System.out.println("Original: [" + rawUsername + "]");
		System.out.println("Cleaned: [" + cleanUsername + "]");

	}
}
class SecurityCheck {
	public static void main(String[] args) {
		String url = "https://www.google.com";
		
		if (url.startsWith("https")) {
			System.out.println("Connection is Secure.");
		} else {
			System.out.println("Warning: Unsecured Connection!.");			
		}
	}
}
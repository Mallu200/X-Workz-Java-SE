class EmailService {
	public static void main(String[] args) {
		System.out.println("Main started");

		String emails[] = {"user1@gmail.com", "user2@yahoo.com", "user3@outlook.com"};
		
		// FOR-EACH LOOP: Each iteration picks one email from the 'emails' array 
		// and stores it in the local variable 'mail'
		for (String mail : emails) {
			// Printing the current email being processed
			System.out.println("Sending welcome mail to: " + mail);
		}

		System.out.println("All emails sent successfully!");
		
		System.out.println("Main ended");
	}
}
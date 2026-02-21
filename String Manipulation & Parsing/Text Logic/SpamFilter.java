class SpamFilter {
	public static void main(String[] args) {
		String message = "Congratulations! You won a free lottery prize!";
		
		boolean isSpam = message.toLowerCase().contains("lottery");
		
		System.out.println("Is this message spam? " + isSpam);
	}
}
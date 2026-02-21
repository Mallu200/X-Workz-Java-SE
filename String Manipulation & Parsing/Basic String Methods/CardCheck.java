class CardCheck {
	public static void main(String[] args) {
		String cardNumber = "4234567890123456";
		
		// charAt(0) gets the very first character
		char firstDigit = cardNumber.charAt(0);
		
		if (firstDigit == '4') {
			System.out.println("This is a visa Card");
		}
	}
}
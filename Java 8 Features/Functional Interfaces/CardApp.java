@FunctionalInterface
interface Greetingcard {
	void sayMessage(String name); // The single abstract method
}

class CardApp {
	public static void main(String[] args) {
		// Lambda implementing the single method 'sayMessage'
		Greetingcard birthdayCard = (name) -> System.out.println("Happy Birthday, " + name + "!");
		
		birthdayCard.sayMessage("Gemini"); 
	}
}
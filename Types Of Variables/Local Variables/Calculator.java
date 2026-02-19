class Calculator {
	public static void main(String[] args) {
		System.out.println("Main started");

		// Local Variable: Declared and initialized inside the method
		// It lives in the Stack memory and only exists while main() is running
		int result = 10 + 20;

		System.out.println("The local result is: " + result);

		System.out.println("Main ended");
	}
}
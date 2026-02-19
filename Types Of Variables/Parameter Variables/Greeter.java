class Greeter {
	// Parameter Variable: 'message' acts as a local variable for this method
	// It receives the value passed from the caller (main method)
	public static void display(String message) {
		System.out.println("Received: " + message);
	}
	
	public static void main(String[] args) {
		System.out.println("Main started");

		// Passing "Hello JAVA!" as an argument to the 'message' parameter
		display("Hello JAVA!");

		System.out.println("Main ended");
	}
}
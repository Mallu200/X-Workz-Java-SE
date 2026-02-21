@FunctionalInterface 
interface WeightChecker {
	boolean isOver(int kg);
}

class Shipping {
	public static void main(String[] args) {
		// Lambda: One parameter (kg), one logic line, no return keyword needed
		WeightChecker check = kg -> kg > 20;
		
		// Returns true if weight is 25
		System.out.println("Is 25kg overweight? " + check.isOver(25));	}
}
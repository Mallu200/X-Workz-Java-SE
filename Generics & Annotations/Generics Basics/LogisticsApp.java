class Container<T> {
	private T item;
	public void add(T item) { this.item = item; }
	public T getItem() { return item; }
}

public class LogisticsApp {
	public static void main(String[] args) {
		// Safe: This container ONLY accepts Strings
		Container<String> shoeBox = new Container<>();
		shoeBox.add("Nike Air");
		String shoe = shoeBox.getItem(); // No casting needed!
		
		// Safe: This container ONLY accepts Integers
		Container<Integer> countBox = new Container<>();
		countBox.add(500);
		
		System.out.println("Shoe: " + shoe + " | Count: " + countBox.getItem());
	}
}
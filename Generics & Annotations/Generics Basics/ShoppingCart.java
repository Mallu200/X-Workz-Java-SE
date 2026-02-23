class Entry<K, V> {
	private K id;
	private V name;
	
	Entry(K id, V name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("ID (" + id.getClass().getSimpleName() + "): " + id);
		System.out.println("Product: " + name);
	}
}

public class ShoppingCart {
	public static void main(String[] args) {
		// Integer ID and String Name
		Entry<Integer, String> product1 = new Entry<>(101, "Mechanical Keyboard");
		
		// String ID (SKU) and Double Price
		Entry<String, Double> product2 = new Entry<>("SKU-99", 1200.00);
		
		product1.display();
		product2.display();
	}
}
import java.util.ArrayList;

class ShoppingCart {
	public static void main(String[] args) {
		ArrayList<String> cart = new ArrayList<>();
		
		// Adding items
		cart.add("Wireless Mouse");
		cart.add("Mechanical Keyboard");
		cart.add("HDMI Cable");
		
		// Removing an item (user changed their mind)
		cart.remove("HDMI Cable");
		
		System.out.println("Items in cart: " + cart);
		System.out.println("Total Items: " + cart.size());
	}
}
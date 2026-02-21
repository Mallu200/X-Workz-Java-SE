interface Payment {
	void pay(double amount); // Abstract: Everyone MUST implement this
	
	// Default: New feature added without breaking old classes
	default void payWithCrypto(double amount) {
		System.out.println("Processing crypto payment of: " + amount); // Logic provided by interface		
	}
}

class OldVendor implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Old Vendor paid via Cash: " + amount); // Implementing mandatory method
	}
	// No need to implement payWithCrypto, it uses the default!
}

public class PaymentGateway {
	public static void main(String[] args) {
		OldVendor v = new OldVendor();
		v.pay(100);
		v.payWithCrypto(50); // Calls the default method from the interface 
	}
}
class Payment {
	void process() {
		System.out.println("Processing general payment...");
	}
}

class UPI extends Payment {
	void process() {
		System.out.println("Processing UPI payment via Scanner...");
	}
}

class Amazon {
	public static void main(String[] args) {
		// Upcasting: UPI object is treated as a general Payment
		Payment p = new UPI();
		p.process(); // Calls the UPI version
	}
}
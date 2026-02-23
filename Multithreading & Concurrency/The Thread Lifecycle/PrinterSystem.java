class Printer {
	synchronized void printDoc(String doc) {
		try {
			System.out.println("Printing: " + doc);
			Thread.sleep(1000); // Simulate printing time
		} catch (InterruptedException e) {}
	}
}

public class PrinterSystem {
	public static void main(String[] args) {
		Printer commonPrinter = new Printer();
		
		Thread user1 = new Thread(() -> commonPrinter.printDoc("Resume.pdf"));
		Thread user2 = new Thread(() -> commonPrinter.printDoc("Photo.jpg"));
		
		user1.start();
		// user2 will likely be BLOCKED here until user1 finishes
		user2.start();
	}
}
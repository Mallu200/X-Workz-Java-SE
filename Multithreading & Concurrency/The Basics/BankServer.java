class TransactionRequest implements Runnable {
	private String user;
	TransactionRequest(String user) { this.user = user;}
	
	@Override
	public void run() {
		// Processes bank withdrawal for a specific user
		System.out.println("Processing transaction for: " + user + " on " + Thread.currentThread().getName());
	}
}

public class BankServer {
	public static void main(String[] args) {
		Thread request1 = new Thread(new TransactionRequest("Alice"));
		Thread request2 = new Thread(new TransactionRequest("Bob"));
		
		request1.start(); // Alice's request processed
		request2.start(); // Bob's request processed
	}
}
import java.util.Vector;

class BankTransactions {
	public static void main(String[] args) {
		Vector<String> transactions = new Vector<>();
		
		// Thread-safe additions
		transactions.add("TXN_501: ₹200 Deposit");
		transactions.add("TXN_502: ₹50 Withdrawl");
		
		System.out.println("Secure Transaction Log: " + transactions);
	}
}
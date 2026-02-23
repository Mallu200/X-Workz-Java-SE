class BankAccount {
	private int balance = 1000;
	
	public synchronized void withdraw(int amount) {
		String name = Thread.currentThread().getName();
		if (balance >= amount) {
			System.out.println(name + " is withdraw ₹" + amount);
			balance -= amount;
			System.out.println("Withdrawal successful. Balance: " + balance);
		} else {
			System.out.println("Insufficient funds for " + name + ". Current balance: " + balance);
		}
	}
}

public class BankSystem {
	public static void main(String[] args) {
		BankAccount accont = new BankAccount();
		
		// Both threads reference the SAME 'accont' object
		Thread t1 = new Thread(() -> accont.withdraw(700), "Husband");
		Thread t2 = new Thread(() -> accont.withdraw(700), "Wife");
		
		t1.start();
		t2.start();
	}
}
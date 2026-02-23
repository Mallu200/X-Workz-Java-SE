class Account {
    private String name;
    public Account(String name) { this.name = name; }

    public void transfer(Account target) {
        synchronized (this) { // Locks Alice
            System.out.println(Thread.currentThread().getName() + " locked " + this.name);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            
            System.out.println(Thread.currentThread().getName() + " waiting for " + target.name);
            synchronized (target) { // Tries to lock Bob, but Bob is locked by Thread 2
                System.out.println("Transfer successful!");
            }
        }
    }
}

public class BankDeadlock {
    public static void main(String[] args) {
        Account alice = new Account("Alice's Account");
        Account bob = new Account("Bob's Account");

        new Thread(() -> alice.transfer(bob), "Thread-1").start();
        new Thread(() -> bob.transfer(alice), "Thread-2").start();
    }
}
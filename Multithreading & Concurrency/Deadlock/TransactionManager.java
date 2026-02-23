class DatabaseRow {
    private String rowID;
    public DatabaseRow(String id) { this.rowID = id; }

    public void update(DatabaseRow other) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " updating " + rowID);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            
            synchronized (other) {
                System.out.println(Thread.currentThread().getName() + " updated both rows.");
            }
        }
    }
}

public class TransactionManager {
    public static void main(String[] args) {
        DatabaseRow rowA = new DatabaseRow("Row_A");
        DatabaseRow rowB = new DatabaseRow("Row_B");

        new Thread(() -> rowA.update(rowB), "Transaction-1").start();
        new Thread(() -> rowB.update(rowA), "Transaction-2").start();
    }
}
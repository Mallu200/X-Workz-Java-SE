class DatabaseSearch extends Thread {
    public void run() {
        System.out.println("Searching database...");
        try { Thread.sleep(1500); } catch (InterruptedException e) {}
        System.out.println("Search complete.");
    }
}

public class SearchApp {
    public static void main(String[] args) throws InterruptedException {
        DatabaseSearch dbThread = new DatabaseSearch();
        dbThread.start();
        
        // The Main thread enters WAITING state until dbThread is TERMINATED
        dbThread.join(); 
        
        System.out.println("Results found! Displaying to user.");
    }
}
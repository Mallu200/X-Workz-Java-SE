class Warehouse {
    private int items = 0;
    private final int CAPACITY = 1;

    synchronized void produce() throws InterruptedException {
        while (items >= CAPACITY) { 
            wait(); // Warehouse full, truck waits
        }
        items++;
        System.out.println("Produced 1 item. Total: " + items);
        notify(); // Tell the worker items are ready
    }

    synchronized void consume() throws InterruptedException {
        while (items == 0) {
            wait(); // Warehouse empty, worker waits
        }
        items--;
        System.out.println("Consumed 1 item. Total: " + items);
        notify(); // Tell the truck there is space
    }
}

public class LogisticsApp {
    public static void main(String[] args) {
        Warehouse wh = new Warehouse();
        new Thread(() -> {
            try { while(true) { wh.produce(); Thread.sleep(500); } } catch(Exception e){}
        }).start();
        
        new Thread(() -> {
            try { while(true) { wh.consume(); Thread.sleep(1000); } } catch(Exception e){}
        }).start();
    }
}
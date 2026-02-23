class SmartPrinter {
    private boolean hasPaper = false;

    synchronized void printTask(String user) throws InterruptedException {
        while (!hasPaper) {
            System.out.println(user + ": Waiting for paper...");
            wait();
        }
        System.out.println(user + ": Printing document.");
    }

    synchronized void refill() {
        System.out.println("--- Tray Refilled ---");
        hasPaper = true;
        notifyAll(); // Wake up ALL users waiting
    }
}

public class OfficePrintSystem {
    public static void main(String[] args) throws InterruptedException {
        SmartPrinter printer = new SmartPrinter();
        
        new Thread(() -> { try { printer.printTask("User1"); } catch(Exception e){} }).start();
        new Thread(() -> { try { printer.printTask("User2"); } catch(Exception e){} }).start();

        Thread.sleep(2000);
        new Thread(printer::refill).start();
    }
}
class MessageLoader {
    private boolean messageArrived = false;

    synchronized void waitForMessage() throws InterruptedException {
        while (!messageArrived) {
            System.out.println("UI: Waiting for messages...");
            wait(); 
        }
        System.out.println("UI Updated: Message Received!");
    }

    synchronized void receiveMessage() {
        System.out.println("Network: Message arrived from server.");
        messageArrived = true;
        notify(); 
    }
}

public class WhatsAppClone {
    public static void main(String[] args) throws InterruptedException {
        MessageLoader loader = new MessageLoader();
        new Thread(() -> {
            try { loader.waitForMessage(); } catch(Exception e){}
        }).start();

        Thread.sleep(2000); // Simulate network delay
        new Thread(loader::receiveMessage).start();
    }
}
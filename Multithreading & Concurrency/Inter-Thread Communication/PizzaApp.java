class PizzaShop {
    private boolean orderPlaced = false;

    synchronized void cook() throws InterruptedException {
        while (!orderPlaced) {
            System.out.println("Chef: Waiting for an order...");
            wait();
        }
        System.out.println("Chef: Cooking Pizza... ");
    }

    synchronized void placeOrder() {
        System.out.println("Customer: Placing order for a Pepperoni Pizza.");
        orderPlaced = true;
        notify();
    }
}

public class PizzaApp {
    public static void main(String[] args) throws InterruptedException {
        PizzaShop shop = new PizzaShop();
        new Thread(() -> {
            try { shop.cook(); } catch(Exception e){}
        }).start();

        Thread.sleep(1500);
        new Thread(shop::placeOrder).start();
    }
}
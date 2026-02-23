class FlashSale {
    private int stock = 1;

    public void buyProduct() {
        // Only this specific part is locked
        synchronized(this) {
            if (stock > 0) {
                System.out.println(Thread.currentThread().getName() + " bought the last iPhone!");
                stock--;
            } else {
                System.out.println("Sold out for " + Thread.currentThread().getName());
            }
        }
    }
}

public class AmazonSale {
    public static void main(String[] args) {
        FlashSale sale = new FlashSale();
        
        for (int i = 1; i <= 5; i++) {
            new Thread(sale::buyProduct, "User-" + i).start();
        }
    }
}
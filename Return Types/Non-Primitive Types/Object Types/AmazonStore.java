class Product {
    String title = "Wireless Headphones";
    double price = 2999.00;
    float rating = 4.5f;
}

class AmazonStore {
    // Returns a 'Product' object package
    static Product getBestSeller() {
        return new Product();
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        Product item = getBestSeller();
        System.out.println("Item: " + item.title + " | Price: ₹" + item.price);
        System.out.println("Main ended");
    }
}
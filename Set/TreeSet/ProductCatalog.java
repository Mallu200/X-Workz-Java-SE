import java.util.TreeSet;

class ProductCatalog {
    public static void main(String[] args) {
        TreeSet<Integer> productIds = new TreeSet<>();

        productIds.add(5005);
        productIds.add(1001);
        productIds.add(5005); // Duplicate ignored
        productIds.add(2002);

        System.out.println("Sorted Catalog: " + productIds);
    }
}
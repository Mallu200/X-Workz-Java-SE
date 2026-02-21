import java.util.Vector;

class LegacyInventory {
    public static void main(String[] args) {
        Vector<Integer> productIds = new Vector<>();

        productIds.add(1001);
        productIds.add(1002);

        // Vector is often used with Enumeration (the old version of Iterator)
        java.util.Enumeration<Integer> en = productIds.elements();
        while(en.hasMoreElements()) {
            System.out.println("Product ID: " + en.nextElement());
        }
    }
}
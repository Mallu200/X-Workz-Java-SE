import java.util.HashMap;

class StoreScanner {
    public static void main(String[] args) {
        HashMap<String, Double> priceCatalog = new HashMap<>();

        priceCatalog.put("PROD_001", 19.99);
        priceCatalog.put("PROD_002", 5.49);
        
        // Updating a price (Value) for an existing Key
        priceCatalog.put("PROD_001", 17.99); 

        System.out.println("Price of PROD_001: $" + priceCatalog.get("PROD_001"));
    }
}
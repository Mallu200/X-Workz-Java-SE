class AmazonSearch {
    // Version 1: Search by Name (String type)
    // Used when users type into the search bar
    void search(String productName) {
        System.out.println("Method search(String) started");
        
        System.out.println("Searching for item: " + productName);
        System.out.println("Status: Matching keywords in database...");
        
        System.out.println("Method search(String) ended");
    }
    
    // Version 2: Search by ID (int type)
    // Overloading: Same name 'search', but used for direct barcode/ID lookups
    void search(int productId) {
        System.out.println("Method search(int) started");
        
        System.out.println("Fetching details for Product ID: " + productId);
        System.out.println("Status: Locating exact warehouse record...");
        
        System.out.println("Method search(int) ended");
    }
    
    public static void main(String[] args) {
        System.out.println("Main method started");
        
        AmazonSearch obj = new AmazonSearch();
        
        // Matches Version 1 (String)
        obj.search("Laptop");
        
        System.out.println("--------------------");
        
        // Matches Version 2 (int)
        obj.search(99801);
        
        System.out.println("Main method ended");
    }
}
class Book {
    String title;

    // --- STEP 1: INDEPENDENT LIFECYCLE ---
    // The book is printed and exists as an individual entity.
    Book(String title) {
        this.title = title;
        // Mandatory SOP to trace the standalone object creation
        System.out.println(">> [PUBLISHER] Book Created: '" + title + "'");
    }
}

class Library {
    String libName;
    
    // --- STEP 2: AGGREGATION (HAS-A) ---
    // The Library holds a collection of Book references.
    // It does not 'own' the books; it only manages them.
    Book[] books; 

    // Constructor: Aggregating existing Book objects
    Library(String name, Book[] books) {
        this.libName = name;
        this.books = books;
        System.out.println(">> [SYSTEM] " + name + " has updated its inventory with " + books.length + " books.");
    }

    void showCatalog() {
        System.out.println("\n--- [LIBRARY CATALOG: " + libName.toUpperCase() + "] ---");
        
        // Safety Check: Verify the array exists
        if (books != null && books.length > 0) {
            for (Book b : books) {
                // Accessing the state of the aggregated Book object
                System.out.println(" > Title: " + b.title);
            }
        } else {
            System.out.println(" > Notice: The library is currently empty.");
        }
        System.out.println("----------------------------------------------\n");
    }
}

class AggregationLib {
    public static void main(String[] args) {
        System.out.println(">> [START] Initializing Library Management System...");

        // 1. Create Child objects independently
        // These books are in the Heap, referenced by 'b1' and 'b2'
        Book b1 = new Book("Java: The Complete Reference");
        Book b2 = new Book("Clean Code");

        // 2. Create Parent and pass the children (Aggregation)
        // We are passing the memory addresses of existing books
        Library central = new Library("City Central Library", new Book[]{b1, b2});
        
        // 3. Utilize the aggregation
        central.showCatalog();

        // 4. WEAK LINK TEST
        System.out.println(">> [ACTION] Shutting down City Central Library...");
        central = null; // The Library object is destroyed
        
        // 5. Verification of Independence
        // The Book objects are NOT destroyed. They are still held by b1 and b2.
        System.out.println(">> [VERIFY] Book Status: '" + b1.title + "' is still available in the system.");
        System.out.println(">> [VERIFY] Book Status: '" + b2.title + "' is still available in the system.");

        System.out.println(">> [END] System session closed.");
    }
}
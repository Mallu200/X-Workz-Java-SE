class Page {
    int pageNum;

    // The Page is a 'Part' that is fundamentally bound to the 'Whole'.
    Page(int num) {
        this.pageNum = num;
        System.out.println(">> [PRINTING-PRESS] Page " + num + " generated and bound.");
    }
}

class Book {
    String title;
    
    // --- STEP 1: COMPOSITION (STRONG HAS-A) ---
    // The Page reference is private. The outside world cannot 
    // see or touch the Page unless the Book allows it.
    private final Page p1; 

    // --- STEP 2: INTERNAL CREATION ---
    // The 'Whole' (Book) is the creator of its 'Parts' (Pages).
    // The Page object is instantiated inside the Book's constructor.
    Book(String title) {
        this.title = title;
        // COMPOSITION: The page is born when the book is born.
        this.p1 = new Page(1); 
        System.out.println(">> [PUBLISHER] Book '" + title + "' is now complete with all pages bound.");
    }

    void read() {
        System.out.println("\n--- [LITERARY SESSION] ---");
        System.out.println("Title         : " + this.title);
        
        // Reaching into the composed object 'p1'
        System.out.println("Current Page  : " + p1.pageNum);
        System.out.println("Status        : Content is accessible.");
        System.out.println("--------------------------\n");
    }
}

class CompositionLibrary {
    public static void main(String[] args) {
        System.out.println(">> [SYS] Loading Digital Manuscript...");

        // 1. Create the Parent (Book)
        // Note: No 'Page' object is created in the main method. 
        // We cannot have a page without a book.
        Book b = new Book("Java Mastery");
        
        // 2. Utilize the system
        b.read();

        // 3. THE STRONG LINK TEST:
        // We set the book 'b' to null.
        System.out.println(">> [ACTION] Deleting the Book object...");
        b = null; 

        // 4. Verification
        // Because 'p1' was a variable inside the Book object 'b', 
        // and we have no other reference to it, Page 1 is now lost.
        System.out.println(">> [GC] The pages have been destroyed along with the book.");
        
        System.out.println(">> [SYS] Session terminated.");
    }
}
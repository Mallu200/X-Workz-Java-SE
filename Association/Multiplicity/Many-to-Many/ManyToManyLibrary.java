class Author {
    String name;

    // --- STEP 1: CONSTRUCTOR ---
    // Authors are created as independent entities in the literary world.
    Author(String name) {
        this.name = name;
        // Mandatory SOP to trace the "Independent" side of the association
        System.out.println(">> [LITERARY-DATABASE] Author Profile Created: " + name);
    }
}

class Book {
    String title;
    
    // --- STEP 2: THE MANY-TO-MANY LINK ---
    // A Book holds a reference to an array of Authors.
    // This allows for "Collaborative Writing" where one book has multiple authors.
    Author[] authors;

    // Constructor: Establishing the 'Link' via Object Injection
    Book(String title, Author[] authors) {
        this.title = title;
        
        // The association is finalized by pointing to the array of Author references
        this.authors = authors;
        System.out.println(">> [PUBLISHER] Printing Phase: '" + title + "' linked to " + authors.length + " contributors.");
    }

    void displayCredits() {
        System.out.println("\n--- [FRONT COVER: BOOK METADATA] ---");
        System.out.println("Title   : " + this.title);
        
        // Safety Check: Ensure the book has authors associated
        if (authors != null && authors.length > 0) {
            System.out.print("Authors : ");
            
            // TRAVERSING THE MANY-SIDE:
            // We iterate through the 'authors' array to reach into each Author object
            for (int i = 0; i < authors.length; i++) {
                System.out.print(authors[i].name + (i < authors.length - 1 ? " & " : ""));
            }
        } else {
            System.out.print("Authors : Anonymous/Unknown");
        }
        System.out.println("\n------------------------------------\n");
    }
}

class ManyToManyLibrary {
    public static void main(String[] args) {
        System.out.println(">> [SYS] Accessing Library Management System...");

        // 1. Create the 'Many' (Authors) as independent objects
        Author a1 = new Author("Dr. Robert");
        Author a2 = new Author("Prof. James");

        // 2. Define the first "Many" set (Collaboration for Book 1)
        Author[] collaborators = {a1, a2};

        // 3. Create the 'Book' object and associate the authors with it
        // The memory addresses of a1 and a2 are passed via the array
        Book b1 = new Book("Advanced Java Design", collaborators);

        // 4. Utilize the association to display credits
        b1.displayCredits();

        System.out.println(">> [SYS] Archive updated successfully.");
    }
}
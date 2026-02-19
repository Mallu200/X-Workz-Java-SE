class Document {
    String text;
    
    // Standard Constructor: Used for creating a brand new file
    Document(String text) {
        this.text = text;
    }
    
    // Copy Constructor: Used for the "Save As" logic
    Document(Document original) {
        if (original != null) {
            // Transferring the content from the original to the new copy
            this.text = original.text;
            System.out.println("New document created with copied content");
        }
    }
    
    void display() {
        System.out.println("Content: " + text);
    }
    
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Original version
        Document doc1 = new Document("Java Lesson 1");
        
        // Creating a duplicate copy
        Document doc2 = new Document(doc1); 
        
        // Modifying the copy won't affect the original (since they are separate objects)
        doc2.text = "Java Lesson 1 (Updated Copy)";

        System.out.println("--- Original ---");
        doc1.display();
        
        System.out.println("--- Copy ---");
        doc2.display();

        System.out.println("Main method ended");
    }
}
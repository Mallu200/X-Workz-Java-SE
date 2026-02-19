class Library {
    public static void main(String[] args) {
        System.out.println("Main started");

        String[] books = {"Java", "Python", "SQL"};
        
        // This prints the Reference (Address)
        System.out.println("Shelf Address: " + books); 
        
        // This prints the Data
        System.out.println("Actual Book: " + books[0]);

        System.out.println("Main ended");
    }
}
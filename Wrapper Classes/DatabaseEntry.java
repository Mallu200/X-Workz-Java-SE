class DatabaseEntry {
    public static void main(String[] args) {
        // int score = null; // ERROR!
        Integer examScore = null; // Perfectly fine
        
        if (examScore == null) {
            System.out.println("Student was absent.");
        }
    }
}
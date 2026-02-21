class UserGen {
    public static void main(String[] args) {
        String fullName = "Alexander";
        
        // Take first 3 letters: indices 0, 1, 2 (doesn't include index 3)
        String shortName = fullName.substring(0, 3).toLowerCase();
        
        String username = shortName + "123";
        
        System.out.println("Suggested Username: " + username); // Output: ale123
    }
}
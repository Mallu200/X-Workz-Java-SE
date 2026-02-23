public class ClassFinder {
    public static void main(String[] args) {
        try {
            // Attempting to load a class that does not exist in the library
            Class.forName("com.mysql.jdbc.NonExistentDriver");
            System.out.println("Class loaded!");
        } catch (ClassNotFoundException e) {
            // Citing: The compiler forces the programmer to handle this
            System.err.println("Error: Required class definition was not found!");
            e.printStackTrace();
        }
    }
}
import java.util.HashMap;

class UniversityPortal {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alice Johnson");
        students.put(102, "Bob Smith");
        students.put(103, "Charlie Brown");

        // Fast lookup by Key
        System.out.println("Student with ID 102: " + students.get(102));
    }
}
import java.util.ArrayList;

class StudentList {
    public static void main(String[] args) {
        // ArrayList<int> list = new ArrayList<>(); // ERROR!
        ArrayList<Integer> ages = new ArrayList<>(); 
        
        // Autoboxing: 20 is a primitive, but Java "boxes" it into an Integer object
        ages.add(20); 
        System.out.println("Age added: " + ages.get(0));
    }
}
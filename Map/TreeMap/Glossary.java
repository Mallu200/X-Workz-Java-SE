import java.util.TreeMap;

class Glossary {
    public static void main(String[] args) {
        TreeMap<String, String> terms = new TreeMap<>();

        terms.put("Inheritance", "Reusing code from parent");
        terms.put("Abstraction", "Hiding internal details");
        terms.put("Polymorphism", "Many forms");

        // Output will be: Abstraction, Inheritance, Polymorphism
        System.out.println("Glossary: " + terms.keySet());
    }
}
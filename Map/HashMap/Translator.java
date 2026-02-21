import java.util.HashMap;

class Translator {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("Hello", "Hola");
        dictionary.put("Goodbye", "Adiós");
        dictionary.put("Thank you", "Gracias");

        System.out.println("How do you say 'Hello'? " + dictionary.get("Hello"));
    }
}
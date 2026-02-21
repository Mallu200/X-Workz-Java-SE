import java.util.TreeSet;

class ContactList {
    public static void main(String[] args) {
        TreeSet<String> contacts = new TreeSet<>();

        contacts.add("Zion");
        contacts.add("Alice");
        contacts.add("Bob");

        // Automatically sorted: Alice, Bob, Zion
        System.out.println("Contacts (A-Z): " + contacts);
    }
}
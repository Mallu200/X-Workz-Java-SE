import java.util.LinkedHashSet;

class WorkshopRegistration {
    public static void main(String[] args) {
        LinkedHashSet<String> attendees = new LinkedHashSet<>();

        attendees.add("alice@email.com");
        attendees.add("bob@email.com");
        attendees.add("alice@email.com"); // Duplicate ignored
        attendees.add("charlie@email.com");

        System.out.println("Attendee List (In order of signup): " + attendees);
    }
}
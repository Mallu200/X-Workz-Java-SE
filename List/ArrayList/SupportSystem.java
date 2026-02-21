import java.util.ArrayList;

class SupportSystem {
    public static void main(String[] args) {
        ArrayList<String> tickets = new ArrayList<>();

        tickets.add("TICKET_101: Internet Down");
        tickets.add("TICKET_102: Billing Error");
        tickets.add("TICKET_103: Password Reset");

        // Resolve the first ticket
        System.out.println("Resolving: " + tickets.get(0));
        tickets.remove(0); // Everything else shifts up!

        System.out.println("Remaining Tickets: " + tickets);
    }
}
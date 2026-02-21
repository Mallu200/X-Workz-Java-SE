import java.util.ArrayDeque;

class SupportLine {
    public static void main(String[] args) {
        ArrayDeque<String> customers = new ArrayDeque<>();

        customers.addLast("Customer_Alice");
        customers.addLast("Customer_Bob");
        customers.addLast("Customer_Charlie");

        System.out.println("Serving: " + customers.pollFirst()); // Alice is served
        System.out.println("Next in line: " + customers.peekFirst()); // Bob is next
    }
}
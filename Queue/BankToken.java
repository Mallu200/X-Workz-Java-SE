import java.util.PriorityQueue;

class BankToken {
    public static void main(String[] args) {
        PriorityQueue<Integer> tokens = new PriorityQueue<>();

        tokens.add(105);
        tokens.add(101);
        tokens.add(103);

        System.out.println("Now Serving Token: " + tokens.poll()); // Serves 101 first
    }
}
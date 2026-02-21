import java.util.ArrayDeque;

class EditorHistory {
    public static void main(String[] args) {
        ArrayDeque<String> history = new ArrayDeque<>();

        history.addLast("Type 'A'");
        history.addLast("Type 'B'");
        
        // If history > 100, remove the oldest (from the front)
        if(history.size() > 1) {
            history.removeFirst();
        }

        System.out.println("Current History: " + history);
    }
}
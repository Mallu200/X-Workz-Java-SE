import java.util.LinkedList;

class EditorUndo {
    public static void main(String[] args) {
        LinkedList<String> actions = new LinkedList<>();

        actions.add("Type: 'Hello'");
        actions.add("Bold Text");
        actions.add("Change Color: Red");

        // Undo: Remove the most recent action
        String undone = actions.removeLast();

        System.out.println("Undone Action: " + undone);
        System.out.println("Remaining Actions: " + actions);
    }
}
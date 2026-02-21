import java.util.Vector;

class ChatRoom {
    public static void main(String[] args) {
        Vector<String> activeUsers = new Vector<>(10, 5); // Initial capacity 10, grows by 5

        activeUsers.addElement("User_Alpha"); // Legacy method
        activeUsers.addElement("User_Bravo");

        System.out.println("Users Online: " + activeUsers.size());
    }
}
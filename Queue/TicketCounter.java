import java.util.LinkedList;
import java.util.Queue;

class TicketCounter {
    public static void main(String[] args) {
        Queue<String> waitingRoom = new LinkedList<>();

        waitingRoom.offer("User_101");
        waitingRoom.offer("User_102");
        
        System.out.println("Processing: " + waitingRoom.poll()); 
    }
}
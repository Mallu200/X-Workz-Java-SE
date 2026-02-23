import java.net.*;

public class PortScanner {
    public static void main(String[] args) {
        for (int port = 8080; port <= 8085; port++) {
            try {
                Socket s = new Socket("localhost", port);
                System.out.println("Port " + port + " is OPEN");
                s.close();
            } catch (IOException e) {
                System.out.println("Port " + port + " is CLOSED");
            }
        }
    }
}
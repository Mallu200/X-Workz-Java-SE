import java.io.*;
import java.net.*;

public class HelloServer {
    public static void main(String[] args) throws IOException {
        // ServerSocket listens on port 5000
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server waiting for client...");
        
        Socket client = server.accept(); // Pauses here until someone connects
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        
        out.println("Welcome to the Java Server!");
        client.close();
        server.close();
    }
}
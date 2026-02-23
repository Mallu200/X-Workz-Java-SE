import java.io.*;
import java.net.*;

public class HelloClient {
    public static void main(String[] args) throws IOException {
        // Connects to 'localhost' (this computer) on port 5000
        Socket socket = new Socket("localhost", 5000);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Server says: " + in.readLine());
        
        socket.close();
    }
}
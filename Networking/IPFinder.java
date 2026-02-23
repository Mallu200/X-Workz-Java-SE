import java.net.*;

public class IPFinder {
    public static void main(String[] args) throws UnknownHostException {
        // InetAddress handles IP and Hostname resolution
        InetAddress address = InetAddress.getByName("www.google.com");
        System.out.println("IP Address: " + address.getHostAddress());
    }
}
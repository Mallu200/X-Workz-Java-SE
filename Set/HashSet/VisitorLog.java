import java.util.HashSet;

class VisitorLog {
    public static void main(String[] args) {
        HashSet<String> ipAddresses = new HashSet<>();

        ipAddresses.add("192.168.1.1");
        ipAddresses.add("192.168.1.2");
        ipAddresses.add("192.168.1.1"); // Duplicate refresh

        System.out.println("Unique Visitors Count: " + ipAddresses.size()); // 2
    }
}
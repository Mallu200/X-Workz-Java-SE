import java.util.*;
import java.util.stream.*;

class SocialMedia {
    public static void main(String[] args) {
        List<String> userStatus = Arrays.asList("Online", "Offline", "Online", "Busy");

        // Use filter to find online users and count() to get the total
        long onlineCount = userStatus.stream()
                                     .filter(status -> status.equals("Online"))
                                     .count();

        // Single line comment: Counts occurrences of 'Online' in the stream
        System.out.println("Users currently online: " + onlineCount);
    }
}
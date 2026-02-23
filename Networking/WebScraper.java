import java.net.*;
import java.util.Scanner;

public class WebScraper {
    public static void main(String[] args) throws Exception {
        // URL object represents the web address
        URL url = new URL("https://www.google.com");
        
        Scanner sc = new Scanner(url.openStream());
        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
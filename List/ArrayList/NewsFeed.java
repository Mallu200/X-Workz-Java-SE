import java.util.ArrayList;

class NewsFeed {
    public static void main(String[] args) {
        ArrayList<String> posts = new ArrayList<>();

        posts.add("Post by UserA: 'Hello World!'");
        posts.add("Post by UserB: 'Coffee is life.'");
        
        // Inserting a "Sponsored" post at the very top (index 0)
        posts.add(0, "AD: Buy this Laptop now!");

        // Accessing a specific post by index
        String trending = posts.get(1); 
        
        System.out.println("Top Post: " + posts.get(0));
        System.out.println("Trending: " + trending);
    }
}
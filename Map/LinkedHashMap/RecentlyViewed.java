import java.util.LinkedHashMap;

class RecentlyViewed {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> items = new LinkedHashMap<>();

        items.put(501, "Leather Boots");
        items.put(202, "Running Shoes");
        items.put(501, "Leather Boots"); // Duplicate Key: updates value, doesn't change order

        System.out.println("Your Browsing History: " + items.values());
    }
}
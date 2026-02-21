import java.util.LinkedHashMap;

class AppCache {
    public static void main(String[] args) {
        // Remembers order of access/insertion
        LinkedHashMap<String, String> cache = new LinkedHashMap<>();

        cache.put("User_Profile", "data_v1");
        cache.put("Settings", "data_v2");
        cache.put("Dashboard", "data_v3");

        // Order is guaranteed: User_Profile -> Settings -> Dashboard
        System.out.println("Cached Pages: " + cache);
    }
}
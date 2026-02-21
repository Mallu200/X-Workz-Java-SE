import java.util.LinkedHashMap;

class Survey {
    public static void main(String[] args) {
        LinkedHashMap<String, String> results = new LinkedHashMap<>();

        results.put("How was the food?", "Excellent");
        results.put("How was the service?", "Good");
        results.put("Would you return?", "Yes");

        System.out.println("Survey Summary: " + results);
    }
}
import java.util.LinkedHashMap;

class FormProcessor {
    public static void main(String[] args) {
        LinkedHashMap<String, String> formData = new LinkedHashMap<>();

        formData.put("FirstName", "John");
        formData.put("LastName", "Doe");
        formData.put("Email", "john@example.com");

        System.out.println("Processing Field: " + formData);
    }
}
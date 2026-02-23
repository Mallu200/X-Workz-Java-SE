import java.lang.annotation.*;
import java.lang.reflect.*;

// 1. Define the Annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.FIELD)          // Only for class variables
@interface JsonField {
    String value() default "";      // Optional key name
}

// 2. Apply it to a Class
class User {
    @JsonField("user_name") 
    String name = "Alice";
    
    @JsonField("user_email") 
    String email = "alice@example.com";
    
    String password = "secret_password"; // No annotation, will be ignored
}

// 3. The "Engine" that reads the annotation
public class JsonEngine {
    public static void main(String[] args) throws Exception {
        User user = new User();
        StringBuilder json = new StringBuilder("{");

        for (Field field : user.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField ann = field.getAnnotation(JsonField.class);
                String key = ann.value().isEmpty() ? field.getName() : ann.value();
                field.setAccessible(true);
                json.append("\"").append(key).append("\": \"").append(field.get(user)).append("\", ");
            }
        }
        System.out.println(json.toString().replaceAll(", $", "") + "}");
    }
}
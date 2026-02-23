import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Authorized {
    String role() default "USER";
}

class AdminPanel {
    @Authorized(role = "ADMIN")
    public void deleteDatabase() {
        System.out.println("Database deleted successfully.");
    }
}

public class SecurityApp {
    public static void main(String[] args) throws Exception {
        String currentUserRole = "GUEST"; // Change to ADMIN to "unlock"
        AdminPanel panel = new AdminPanel();
        
        var method = panel.getClass().getMethod("deleteDatabase");
        Authorized auth = method.getAnnotation(Authorized.class);
        
        if (auth.role().equals(currentUserRole)) {
            panel.deleteDatabase();
        } else {
            System.out.println("Access Denied! You are not an " + auth.role());
        }
    }
}
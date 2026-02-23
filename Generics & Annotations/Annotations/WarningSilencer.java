import java.util.*;

public class WarningSilencer {
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {
        // This is a "Raw Type" list (old Java style)
        List list = new ArrayList(); 
        list.add("This would normally cause a warning");
        
        System.out.println("Code ran without compiler warnings!");
    }
}
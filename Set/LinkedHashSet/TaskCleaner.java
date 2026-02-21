import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Arrays;

class TaskCleaner {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>(Arrays.asList("Wake up", "Code", "Eat", "Code", "Sleep"));

        // Clean duplicates but keep the daily flow
        LinkedHashSet<String> cleanTasks = new LinkedHashSet<>(tasks);

        System.out.println("Daily Schedule: " + cleanTasks);
    }
}
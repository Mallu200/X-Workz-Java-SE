import java.util.TreeMap;

class GradeRanker {
    public static void main(String[] args) {
        TreeMap<Integer, String> rankings = new TreeMap<>();

        rankings.put(88, "Alice");
        rankings.put(95, "Bob");
        rankings.put(72, "Charlie");

        System.out.println("Rankings (Lowest to Highest): " + rankings);
        System.out.println("Topper: " + rankings.lastEntry()); // Gets highest key
    }
}
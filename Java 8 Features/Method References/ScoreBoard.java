import java.util.function.BiFunction;

class ScoreBoard {
    public static void main(String[] args) {
        // Lambda version: (s1, s2) -> s1.compareTo(s2)
        // Method Reference: Type::methodName
        BiFunction<Integer, Integer, Integer> compareScores = Integer::compare;

        // Single line comment: Compares 50 and 80, returns a negative value since 50 < 80
        System.out.println("Comparison Result: " + compareScores.apply(50, 80));
    }
}
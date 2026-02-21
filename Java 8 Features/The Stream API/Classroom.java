import java.util.*;
import java.util.stream.*;

class Classroom {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(78, 92, 65, 88, 95);

        // sorted() with a comparator for descending order
        List<Integer> topScores = marks.stream()
                                       .sorted(Comparator.reverseOrder())
                                       .collect(Collectors.toList());

        // Single line comment: Sorts the marks from highest to lowest
        System.out.println("Top Scores: " + topScores);
    }
}
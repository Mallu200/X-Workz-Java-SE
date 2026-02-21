import java.util.ArrayList;

class GradeBook {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();

        grades.add(85);
        grades.add(92);
        grades.add(78);

        // Updating a grade (after a re-check)
        // Change the grade at index 2 (78) to 88
        grades.set(2, 88);

        System.out.println("Final Grades: " + grades);
    }
}
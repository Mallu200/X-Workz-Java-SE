class ReportCard {
    // char is perfect for single-letter grades
    static char getFinalGrade() {
        // Logic: Returns the grade based on marks
        return 'A'; // Must use single quotes
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        char grade = getFinalGrade();
        System.out.println("Student Grade: " + grade);
        System.out.println("Main ended");
    }
}
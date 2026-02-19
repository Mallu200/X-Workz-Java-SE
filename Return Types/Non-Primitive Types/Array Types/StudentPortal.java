class StudentPortal {
    // char[] returns a collection of character grades
    static char[] getSubjectGrades() {
        // Logic: Returns grades for Math, Science, and English
        return new char[]{'A', 'B', 'A'};
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        char[] grades = getSubjectGrades();
        System.out.println("Science Grade: " + grades[1]);
        System.out.println("Main ended");
    }
}
class ExamGrader {
    public static void main(String args[]) {
        System.out.println("Main started");

        int marks[] = {5, 0, 8, 0, 10};

        // FOR-EACH LOOP: Iterating through question scores
        for (int score : marks) {
            
            // VALIDATION: Check for unattempted/blank questions
            if (score == 0) {
                // When a 0 is found, we skip the grading feedback step
                // This prevents cluttering the report with "0" marks messages
                continue; 
            }
            
            // This logic only executes for non-zero scores
            System.out.println("Question graded. Points: " + score);
        }

        System.out.println("Main ended");
    }
}
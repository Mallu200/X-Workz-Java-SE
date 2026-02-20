class GradeBook {
    public static void main(String[] args) {
        short testScore = 85;
        float averageScore = testScore; // Widening (Automatic)

        System.out.println("Raw Score: " + testScore);
        System.out.println("Average for Report: " + averageScore); // Output: 85.0
    }
}
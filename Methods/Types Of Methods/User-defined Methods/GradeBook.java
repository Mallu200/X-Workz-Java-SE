class GradeBook {
    // USER-DEFINED METHOD: getAverage
    // Inputs: Three integers (marks)
    // Output: A double (the precise average)
    static double getAverage(int m1, int m2, int m3) {
        // We use 3.0 to ensure "Floating Point Division".
        // If we used just 3, Java might chop off the decimals!
        return (m1 + m2 + m3) / 3.0;
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // The method "collects" the three values and returns the result
        double avg = getAverage(85, 90, 78);
        
        System.out.println("Student Average: " + avg);

        // You can even pass calculations as arguments!
        System.out.println("New Average: " + getAverage(70, 80, 95));

        System.out.println("Main ended");
    }
}
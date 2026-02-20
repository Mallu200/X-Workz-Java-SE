class StepTracker {
    public static void main(String[] args) {
        int stepsTaken = 4000;
        int goal = 10000;

        // Note: In pure int math, (4000/10000) is 0. 
        // We multiply by 100 first to get the percentage!
        int percentage = (stepsTaken * 100) / goal;

        System.out.println("Goal Progress: " + percentage + "%"); // 40%
    }
}
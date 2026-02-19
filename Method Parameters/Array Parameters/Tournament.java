class Tournament {
    // Parameter 'scores' allows finding the max value in the set
    static void findHighestScore(int[] scores) {
        System.out.println("Method findHighestScore started");
        
        int max = scores[0];
        for (int s : scores) {
            if (s > max) {
                max = s;
            }
        }
        
        System.out.println("The Top Score of the season is: " + max);
        System.out.println("Method findHighestScore ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        int[] matchScores = {45, 82, 91, 33, 76};
        findHighestScore(matchScores);
        System.out.println("Main ended");
    }
}
import java.util.TreeSet;

class Leaderboard {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(450);
		scores.add(980);
		scores.add(120);
		scores.add(760);
		
		// Output will be: 120, 450, 760, 980
        System.out.println("Ranked Scores: " + scores);
        System.out.println("Lowest Score: " + scores.first());
        System.out.println("Highest Score: " + scores.last());
	}
}
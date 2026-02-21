import java.util.HashSet;
import java.util.Random;

class LotterySystem {
    public static void main(String[] args) {
        HashSet<Integer> winningNumbers = new HashSet<>();
        Random random = new Random();

        while (winningNumbers.size() < 6) {
            winningNumbers.add(random.nextInt(49) + 1);
        }

        System.out.println("Tonight's Winning Numbers: " + winningNumbers);
    }
}
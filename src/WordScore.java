import java.util.Arrays;
import java.util.Comparator;

public class WordScore {
    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));
    }

    private static String high(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
    }

    private static int getScore(String s) {
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            score += (int) s.charAt(i) - 96;
        }

        return score;
    }

}

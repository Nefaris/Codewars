import java.util.Arrays;

public class FindRheOddInt {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10}));
    }

    private static int findIt(int[] a) {
        Arrays.sort(a);

        for (int i = 0; i < a.length - 1; i += 2) {
            if (a[i] != a[i + 1]) return a[i];
        }

        return a[a.length - 1];
    }
}

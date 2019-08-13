public class DRoot {

    public static void main(String[] args) {
        System.out.printf("16 -> %s\n", digital_root(16));
        System.out.printf("456 -> %s\n", digital_root(456));
    }

    private static int digital_root(int n) {
        if (n < 10) {
            return n;
        }

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return digital_root(sum);
    }

}

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(2));
        System.out.println(makeNegative(0));
        System.out.println(makeNegative(-4));
    }

    private static int makeNegative(final int x) {
        return (x > 0 ? -x : x);
    }
}

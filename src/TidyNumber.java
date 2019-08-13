public class TidyNumber {
    public static void main(String[] args) {
        System.out.println(tidyNumber(1234));
        System.out.println(tidyNumber(1254));
    }

    private static boolean tidyNumber(int number) {
        int lastNum = number % 10;

        while (number > 0) {
            if (number % 10 > lastNum) {
                return false;
            } else {
                lastNum = number % 10;
                number /= 10;
            }
        }

        return true;
    }
}

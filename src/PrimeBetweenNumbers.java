public class PrimeBetweenNumbers {
    public static void main(String[] args) {
        System.out.println(returnPrimeBetweenNumbers(3, 5));
    }

    public static int returnPrimeBetweenNumbers(int lowestNumber, int highestNumber) {
        int highestPrime = -1;

        for (int i = lowestNumber; i <= highestNumber; i++) {
            if (isPrime(i)) {
                highestPrime = i;
            }
        }

        return highestPrime;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
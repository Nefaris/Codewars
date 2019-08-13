public class YearFromCountry {
    public static void main(String[] args) {
        System.out.println(century(1705));
        System.out.println(century(1900));
        System.out.println(century(1601));
        System.out.println(century(2000));
        System.out.println(century(1900));
    }

    private static int century(int number) {
        return (number % 100 == 0 ? number / 100 : number / 100 + 1);
    }
}

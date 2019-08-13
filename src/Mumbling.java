public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
        System.out.println(accum("DRep"));
    }

    private static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            sb.append(Character.toUpperCase(s.charAt(i)));
            for (int j = 0; j < i; j++) {
                sb.append(s.charAt(i));
            }
            if (i != s.length() - 1) sb.append('-');
        }

        return sb.toString();
    }
}

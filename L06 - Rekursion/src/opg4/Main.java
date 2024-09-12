package opg4;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("NAHTANOJ"));
        String s = "Jonathan";
        //System.out.println(s.substring(1, s.length()-1));
    }

    public static String reverse(String s) {
        int l = s.length();
        return (l == 0) ? "" : s.substring(l-1) + reverse(s.substring(0, l-1));
    }
}

package opg6;

public class Main {
    public static void main(String[] args) {
        System.out.println(gcd(12, 12));
    }

    /** Pre: both params >= 2 */
    public static int gcd(int a, int b) {
        if (b <= a && a % b == 0) return b;
        else if (a < b) return gcd(b, a);
        else return gcd(b, a % b);
    }
}

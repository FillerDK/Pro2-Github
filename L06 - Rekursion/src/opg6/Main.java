package opg6;

public class Main {
    public static void main(String[] args) {

    }

    public static int gcd(int a, int b) {
        if (a >= b && a % b == 0) return b;
        else if (a < b) return gcd(b, a);
        else return gcd(b, a % b);
    }
}

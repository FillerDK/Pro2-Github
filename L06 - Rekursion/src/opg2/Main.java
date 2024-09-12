package opg2;

public class Main {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
        System.out.println(power2(2, 5));
    }

    public static int power(int n, int p) {
        return (p == 0) ? 1 : power(n, p-1) * n;
    }

    public static int power2(int n, int p) {
        if (p == 0) {
            return 1;
        } else if (p % 2 == 1) {
            return power2(n, p - 1) * n;
        } else {
            return power2(n * n, p / 2);
        }
    }
}

package opg3;

public class Main {
    public static void main(String[] args) {
        System.out.println(prod(3, 3));
        System.out.println(prodRus(3, 3));
    }

    public static int prod(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return b;
        } else {
            return prod(a - 1, b) + b;
        }
    }

    public static int prodRus(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (a >= 2 && a % 2 == 0) {
            return prodRus(a / 2, 2 * b);
        } else {
            return prodRus(a - 1, b) + b;
        }
    }
}

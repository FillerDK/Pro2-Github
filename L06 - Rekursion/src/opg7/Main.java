package opg7;

public class Main {
    public static void main(String[] args) {
        int d = 10;
        for (int i = 1; i <= d  ; i++) {
            System.out.printf("%4d\n", domino(i));
        }
    }

    public static int domino(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return domino(n - 1) + domino(n - 2);
        }
    }
}

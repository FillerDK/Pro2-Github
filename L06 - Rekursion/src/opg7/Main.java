package opg7;

public class Main {
    public static void main(String[] args) {

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

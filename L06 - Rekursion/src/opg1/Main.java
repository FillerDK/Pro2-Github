package opg1;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial (int n) {
        return (n == 1) ? 1 : n * factorial(n - 1);
    }
}

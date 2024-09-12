package ex3;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * Pre: n >= 0
     * Returns the n'th number in the sequence defined as:
     *     no(0) = 2
     *     no(1) = 1
     *     no(2) = 5
     *     no(n) = 2*no(n-3)-no(n-1)            if n > 2 and n is even
     *     no(n) = no(n-1)+no(n-2)+3*no(n-3)    if n > 2 and n is odd
     * */
    public static int calcNo(int n) {
        int result;
        if (n == 0) {
            result = 2;
        } else if (n == 1) {
            result = 1;
        } else if (n == 2) {
            result = 5;
        } else {
            if (n % 2 == 0)
                result = 2 * calcNo(n-3) - calcNo(n-1);
            else
                result = calcNo(n-1) + calcNo(n-2) + 3 * calcNo(n-3);
        }
        return result;
    }
}

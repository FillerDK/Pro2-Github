package ex3;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            System.out.printf("no(%d) = %d\n", i, no(i));
        }

        System.out.println();

        for (int i = 0; i <= 6; i++) {
            System.out.printf("no(%d) = %d\n", i, calcNo(i));
        }
    }

    // section 3.1
    /*
    no(3) = no(2) + no(1) + 3*no(0) = 5 + 1 + 3*2 = 5 + 1 + 6 = 12
    no(4) = 2*no(1) - no(3) = 2*1 - 12 = 2 - 12 = -10
    no(5) = no(4) + no(3) + 3*no(2) = -10 + 12 + 3*5 = -10 + 12 + 15 = 17
    no(6) = 2*no(3) - no(5) = 2*12 - 17 = 24 - 17 = 7
     */

    // section 3.2
    /**
     * Pre: n >= 0
     * Returns the n'th number in the sequence defined as:
     *     no(0) = 2
     *     no(1) = 1
     *     no(2) = 5
     *     no(n) = 2*no(n-3)-no(n-1)            if n > 2 and n is even
     *     no(n) = no(n-1)+no(n-2)+3*no(n-3)    if n > 2 and n is odd
     * */
    public static int no(int n) {
        int result;
        if (n == 0) {
            result = 2;
        } else if (n == 1) {
            result = 1;
        } else if (n == 2) {
            result = 5;
        } else {
            if (n % 2 == 0)
                result = 2 * no(n-3) - no(n-1);
            else
                result = no(n-1) + no(n-2) + 3 * no(n-3);
        }
        return result;
    }

    // section 3.3
    /*
    Programme an iterative method that calculates
    the n'th number in the sequence. No recursion
    is allowed here.
     */

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
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 5;
        }

        // Vi skal bruge tre variabler til at holde værdierne af no(n-3), no(n-2), og no(n-1)
        int noMinus3 = 2; // no(0)
        int noMinus2 = 1; // no(1)
        int noMinus1 = 5; // no(2)
        int result = 0;

        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0) {
                // Hvis i er lige
                result = 2 * noMinus3 - noMinus1;
            } else {
                // Hvis i er ulige
                result = noMinus1 + noMinus2 + 3 * noMinus3;
            }

            // Opdater de tre variabler til næste iteration
            noMinus3 = noMinus2;
            noMinus2 = noMinus1;
            noMinus1 = result;
        }

        return result;
    }
}

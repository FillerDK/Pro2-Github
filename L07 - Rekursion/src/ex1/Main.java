package ex1;

public class Main {
    public static void main(String[] args) {
        int m = 7;
        int n = 7;

        System.out.println("Table of (K(n,m)");
        System.out.print("  m ");
        for (int i = 0; i <= m; i++) {
            System.out.printf("%-4d", i);
        }
        System.out.println();
        System.out.print("n ");
        for (int i = 0; i <= m; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", binomial(i, j));
            }
            System.out.println();
        }
    }

    /* 0 <= m <= n */
    /* K(n, 0) = 1 = K(n, m) */
    /* K(n, m) = K(n-1, m) + K(n-1, m-1), 0 <m<n */

    /** Pre: 0 <= m <= n */
    public static int binomial(int n, int m) {
        if (m > n) {
            return 0;
        } else if (0 == m || m == n) {
            return 1;
        } else {
            return binomial(n-1, m) + binomial(n-1, m-1);
        }
    }
}

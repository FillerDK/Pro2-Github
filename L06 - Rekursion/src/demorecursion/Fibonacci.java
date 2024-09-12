package demorecursion;

import java.util.Locale;

public class Fibonacci {

    //  index | 0 | 1 | 2 | 3 | 4 | 5 |  6 |  7 |  8   
    // ----------------------------------------------
    //  value | 1 | 1 | 2 | 3 | 5 | 8 | 13 | 21 | 34

    // next value is the sum of the 2 previous values

    // value at index i = (value at index i-2) + (value at index i-1)

    // Define: fib(i) = value at index i

    // Recursive definition:

    // fib(i) = fib(i-2) + fib(i-1)  // recursive case
    // fib(0) = 1                    // base case
    // fib(1) = 1                    // base case

    // Example: fib(6) = 13

    public static long fib(int n) {
        long result;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            result = fib(n - 1) + fib(n - 2);  // result is fib(n)
        }
        return result;
    }

//  public static long fib(int n) {
//  if (n == 0 || n == 1)
//      return 1;
//  else
//      return fib(n - 1) + fib(n - 2);
//}

    public static void main(String[] args) {
        //Locale.setDefault(Locale.GERMANY);

        System.out.printf("%3s   %6s \n", "n", "fib(n)");
        System.out.printf("%4s===%6s=\n", "====", "======");

        for (int n = 0; n <= 20; n++) {
            System.out.printf("%3d   %,d\n", n, fib(n));
        }
        System.out.println();

        System.out.println("Iterative:");
        for (int n = 0; n <= 20; n++) {
            System.out.printf("%3d   %,d\n", n, fibIt(n));
        }
    }

    // iterative
    public static long fibIt(int n) {
        if (n == 0 || n == 1)
            return 1;
        else {
            long fib_2 = 1;   // fib(n-2)
            long fib_1 = 1;   // fib(n-1)
            long fib = 2;     // fib(n)
            for (int i = 3; i <= n; i++) {
                fib_2 = fib_1;
                fib_1 = fib;
                fib = fib_1 + fib_2;
            }
            return fib;
        }
    }
}

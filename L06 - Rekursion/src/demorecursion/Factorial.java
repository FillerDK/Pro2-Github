package demorecursion;

public class Factorial {

//  n! = n * (n-1) * (n-2) * .. * 2 * 1

//  5! = 5 * 4 * 3 * 2 * 1
//  4! = 4 * 3 * 2 * 1
//  5! = 5 * 4!

//  Recursive definition:
//  n! = n * (n-1)!    for n >= 1
//  1! = 1

//  As function:
//  f(n) = n!        // this is the definition of f(n)
//  f(1) = 1

//  Recursive definition:
//  f(n) = n * f(n-1)    

//	f(1) = 1          // base case
//	f(n) = n * f(n-1) // recursive case

    // Pre: n >= 1.
    public static int f(int n) {
        int result;
        if (n == 1)
            result = 1; // result is f(1)
        else
            result = n * f(n - 1); // result is f(n)
        return result;
    }

//    public static int f(int n) {
//        if (n == 1)
//            return 1;
//        else
//            return n * f(n - 1);
//    }

    public static void main(String[] args) {

        System.out.printf("%8s", "i:");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%8d", i);
        }
        System.out.println();

        System.out.printf("%8s", "f(i):");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%8d", f(i));
        }
        System.out.println();
    }

    // iterative
    public static int fI(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}

package demorecursion;

public class RecursionExplaned {

    // method not returning a value
    public static void f(int n) {
        System.out.println(n);
    }

    public static void fRec(int n) {
        if (n == 0) {
            System.out.println(0);
        } else {
            fRec(n - 1);
            System.out.println(n);
        }

    }

    //-----------------------------------------------------

    // method returning a value
    public static int g(int n) {
        return n;
    }

    public static int gRec(int n) {
        int sum;
        if (n == 0)
            sum = 0;
        else
            sum = gRec(n - 1) + n;
        System.out.println("sum: " + sum);
        return sum;
    }

    //-----------------------------------------------------

    public static void main(String[] args) {
        System.out.println("Calling f(n) for n in 0..4:");
        for (int i = 0; i <= 4; i++) {
            f(i);
        }
        System.out.println();

        System.out.println("Calling fRec(4) once:");
        fRec(4);
        System.out.println();

        System.out.println("Calling g(n) for n in 0..4:");
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            sum += g(i);
            System.out.println("sum: " + sum);
        }

        System.out.println();

        System.out.println("Calling fRec(4) once:");
        int sumRec = gRec(4);
        System.out.println("sumRec = " + sumRec);
    }
}

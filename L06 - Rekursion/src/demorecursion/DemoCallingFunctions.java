package demorecursion;

public class DemoCallingFunctions {

    public static void f(int n) {
        int a = 8;
        System.out.println("Into f(" + n + ")");
        g(n-1);
//        if (n > 0)
//            f(n - 1);
        System.out.println("Out of f(" + n+ ")");

    }

    public static void g(int m) {
        int b = 7;
        System.out.println("In g(" + m + ")");
    }

    public static void main(String[] args) {
        f(2);
    }
}

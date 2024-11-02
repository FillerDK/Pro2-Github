package DemoGenerics.withsuper;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("Ib");
        Person p2 = new Person("Ulla");
        Person p3 = new Person("Per");

        Mechanic m1 = new Mechanic("Keld", 200);
        Mechanic m2 = new Mechanic("Hans", 300);
        Mechanic m3 = new Mechanic("Jens", 400);

        Person maxP = max(p1, p2, p3);
        System.out.println(maxP);
        System.out.println();

        Mechanic maxM = max(m1, m2, m3);
        System.out.println(maxM);
        System.out.println();

        System.out.println(max("Ib", "Ulla", "Per"));
        System.out.println(max(2, 7, 4));
        System.out.println(max(3.1, 2.0, 1.4));
        System.out.println();
    }

//    public static Person max(Person x, Person y, Person z) {
//        Person max = x;
//        if (y.compareTo(max) > 0) max = y;
//        if (z.compareTo(max) > 0) max = z;
//        return max;
//    }
//
//    public static Mechanic max(Mechanic x, Mechanic y, Mechanic z) {
//        Mechanic max = x;
//        if (y.compareTo(max) > 0) max = y;
//        if (z.compareTo(max) > 0) max = z;
//        return max;
//    }

    public static <T extends Comparable<? super T>> T max(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }
}

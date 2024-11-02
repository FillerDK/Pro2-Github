package DemoGenerics.withextends;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Person p = new Person("");
        Mechanic m = new Mechanic("", 3);
//        p = m; // allowed, because Mechanic is a subclass to Person

        //---------------------------------------------------------------------

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Hans"));
        persons.add(new Person("Anders"));

        ArrayList<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(new Mechanic("Mads", 250));
        mechanics.add(new Mechanic("Keld", 280));

//        persons = mechanics; // not allowed, because ArrayList<Mechanic> is NOT a subclass to ArrayList<Person>

        System.out.print("printPersonNames(persons): ");
        printPersonNames(persons);
        System.out.println();
//        printPersonList(mechanics); // not allowed, because ArrayList<Mechanic> is NOT a subclass to ArrayList<Person>

        System.out.print("printMechanicNames(mechanics): ");
        printMechanicNames(mechanics);
        System.out.println();

        System.out.print("printNames(persons): ");
        printNames(persons); // allowed, because ArrayList<? extends Person> can reference any ArrayList<A>, where A is a subclass to Person
        System.out.println();
        System.out.print("printNames(mechanics): ");
        printNames(mechanics); // allowed, because ArrayList<? extends Person> can reference any ArrayList<A>, where A is a subclass to Person
        System.out.println();

        //---------------------------------------------------------------------

//        List<String> strings = new ArrayList<>(List.of("Kurt", "Viggo"));
//        List<Integer> integers = new ArrayList<>(List.of(1, 2));
//        System.out.println(strings.getClass()); // java.util.ArrayList, type erasure of <String>
//        System.out.println(integers.getClass()); // java.util.ArrayList, type erasure of <Integer>
//        System.out.println(strings.getClass() == integers.getClass()); // true
    }

    public static void printPersonNames(ArrayList<Person> list) {
        for (Person p : list) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }

    public static void printMechanicNames(ArrayList<Mechanic> list) {
        for (Mechanic m : list) {
            System.out.print(m.getName() + " ");
        }
        System.out.println();
    }

    public static <E extends Person> void printNames(ArrayList<E> list) {
        for (E p : list) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }
}

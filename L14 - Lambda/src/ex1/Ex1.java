package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );
        System.out.println(persons);
        System.out.println();
        System.out.println("a) " + findFirst(persons, p -> p.getAge() == 44));
        System.out.println("b) " + findFirst(persons, p -> p.getName().startsWith("S")));
        Predicate<Person> containsMoreIs = p -> p.getName().chars()
                                                           .filter(ch -> ch == 'i')
                                                           .count() > 1;
        System.out.println("c) " + findFirst(persons, containsMoreIs));
        System.out.println("d) " + findFirst(persons, p -> p.getName().length() == p.getAge()));
        System.out.println("e) " + findAll(persons, p -> p.getAge() < 30));
        System.out.println("f) " + findAll(persons, p -> p.getName().contains("i")));
        System.out.println("g) " + findAll(persons, p -> p.getName().startsWith("S")));
        System.out.println("h) " + findAll(persons, p -> p.getName().length() == 5));
        Predicate<Person> nameLength6plusAgeBelow40 =
                p -> p.getName().length() >= 6 && p.getAge() < 40;
        System.out.println("i) " + findAll(persons, nameLength6plusAgeBelow40));
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }

    public static List<Person> findAll(List<Person> list, Predicate<Person> filter) {
        ArrayList<Person> list1 = new ArrayList<>();

        for (Person p : list) {
            if (filter.test(p)) {
                list1.add(p);
            }
        }

        return list1;
    }
}

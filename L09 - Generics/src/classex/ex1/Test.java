package classex.ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // section a)
        Person<String> pS1 = new Person<>("Sune", 26);
        Person<String> pS2 = new Person<>("Frank", 40);

        Person<FullName> pF1 = new Person<>(new FullName("Søren", "Hansen"), 67);
        Person<FullName> pF2 = new Person<>(new FullName("Mette", "Blomsterberg"), 54);

        System.out.println(pS1);
        System.out.println(pF1);

        // section b)
        System.out.println(pS1.compareTo(pS2));
        System.out.println(pF1.compareTo(pF2));
        System.out.println();

        ArrayList<Person<FullName>> persons = new ArrayList<>();
        persons.add(pF1);
        persons.add(pF2);

        System.out.println("Before:\n" + persons);
        Collections.sort(persons);
        System.out.println("After:\n" + persons);
        System.out.println();

        // section c)
        persons.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        System.out.println("Sorted by age: " + persons);
    }
}

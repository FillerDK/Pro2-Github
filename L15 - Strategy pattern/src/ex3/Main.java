package ex3;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Customer oliver = new Customer(2, "Oliver");
        Customer philip = new Customer(1, "Philip");
        compareNames compareNames = new compareNames();

        Customer.setComp(compareNames);

        System.out.println("Compare names: " + oliver.compareTo(philip));

        compareNumbers compareNumbers = new compareNumbers();
        Customer.setComp(compareNumbers);

        System.out.println("Compare numbers: " + oliver.compareTo(philip));

        Comparator<Customer> lambda = (p1, p2) -> p1.getName().compareTo(p2.getName());

        Customer.setComp(lambda);

        System.out.println("\nExtra: lambda");
        System.out.println("Compare names: " + oliver.compareTo(philip));
    }
}

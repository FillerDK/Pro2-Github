package ex3;

import java.util.ArrayList;

public class TestApp {

    public static void main(String[] args) {

        // Q6
        // TODO: create a salesman and a purchaser
        Salesman salesman = new Salesman("Mette");
        Buyer buyer = new Buyer("Cecilie");

        Book donaldDuck = new Book("Donald Duck");
        // TODO: add observers
        donaldDuck.registerObserver(salesman);
        donaldDuck.registerObserver(buyer);

        // TODO: make purchaser buy 6 copies of donaldDuck
        buyer.buyBook(donaldDuck, 6);
        System.out.println();

        Book java = new Book("Java");
        // TODO: add observers
        java.registerObserver(salesman);
        java.registerObserver(buyer);

        // TODO: make purchaser buy 8 copies of java
        buyer.buyBook(java, 8);
        System.out.println();

        Book designPatterns = new Book("Design Patterns");
        // TODO: add observers
        designPatterns.registerObserver(salesman);
        designPatterns.registerObserver(buyer);

        // TODO: make purchaser buy 10 copies of designPatterns
        buyer.buyBook(designPatterns, 10);
        System.out.println();

        Customer bob = new Customer("Bob");
        Customer alice = new Customer("Alice");
        Customer harry = new Customer("Harry");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(bob);
        customers.add(alice);
        customers.add(harry);

        //---------------------------------------------------------------------

        makeSale(donaldDuck, bob);
        System.out.println();
        makeSale(donaldDuck, alice);
        System.out.println();
        makeSale(donaldDuck, harry);
        System.out.println();

        makeSale(java, bob);
        System.out.println();
        makeSale(java, alice);
        System.out.println();
        makeSale(java, harry);
        System.out.println();

        makeSale(designPatterns, bob);
        System.out.println();

        // TODO: print each customer and his/her books
        for (Customer c : customers) {
            System.out.printf("%s's books:\n", c.getName());
            for (Book b : c.getBooks()) {
                System.out.printf("%s\n", b.getTitle());
            }
            System.out.println();
        }
    }

    public static void makeSale(Book b, Customer c) {
        System.out.println("Sale: " + b + " sold to " + c.getName());
        b.addCustomer(c);
        c.addBook(b);
        b.decCount(1);
    }
}

package ex3;

import java.util.HashSet;
import java.util.Set;

public class Salesman implements BookObserver {
    private final String name; // not empty

    public Salesman(String name) {
        this.name = name;
    }

    // Q5
    @Override
    public void update(Book book) {
        Set<Book> books = new HashSet<>();

        for (Customer c : book.getCustomers())
            for (Book b : c.getBooks())
                if (b != book)
                    books.add(b);

        System.out.printf("""
                Books bought by other people who also bought: %s
                """, book.getTitle());
        if (books.size() < 1) System.out.println("None");
        else {
            for (Book b : books)
                System.out.println(b.getTitle());
        }
        System.out.println();
    }
}

package ex3;

import java.util.ArrayList;

public class Customer {
    private final String name; // not empty

    // Q1
    /**
     * Association 0..* --- 0..* Book
     */
    private final ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

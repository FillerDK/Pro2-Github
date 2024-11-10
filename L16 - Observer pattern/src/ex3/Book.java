package ex3;

import java.util.ArrayList;

public class Book {
    private final String title; // not empty
    private int count;

    // Q1
    /**
     * Association 0..* --- 0..* Customer
     */
    private final ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Q3
    private final ArrayList<Buyer> observers = new ArrayList<>();

    public void registerObserver(Buyer buyer) {
        observers.add(buyer);
    }

    public void removeObserver(Buyer buyer) {
        observers.remove(buyer);
    }

    public void notifyObservers() {
        for (Buyer b : observers) {
            b.update(this);
        }
    }

    public Book(String title) {
        this.title = title;
        this.count = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void incCount(int amount) {
        count += amount;
    }

    public void decCount(int amount) {
        count -= amount;
        notifyObservers();
    }

    @Override
    public String toString() {
        return title + "(" + count + ")";
    }
}

package ex3;

import java.util.Comparator;

public class compareNumbers implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return Integer.compare(c1.getNumber(), c2.getNumber());
    }
}

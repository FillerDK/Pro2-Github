package opg2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Customer[] customers = new Customer[4];

        customers[0] = new Customer("Jens", "Hansen", 65);
        customers[1] = new Customer("Søren", "Petersen", 65);
        customers[2] = new Customer("Jens", "Sørensen", 85);
        customers[3] = new Customer("Jens", "Sørensen", 65);

        Customer c1 = new Customer("Philip", "Ingerslev", 22);

        System.out.println(biggestCustomer(customers).toString());
        System.out.println(Arrays.toString(biggerThanCustomer(customers, c1)));
    }

    /**
     * Finds the biggest customer in an array of customers.
     *
     * @param customers an array of customers.
     * @return the biggest customer object from an array.
     */
    public static Customer biggestCustomer(Customer[] customers) {
        Customer biggest = customers[0];

        for (int i = 1; i < customers.length; i++) {
            if (customers[i].compareTo(biggest) > 0) {
                biggest = customers[i];
            }
        }

        return biggest;
    }

    /**
     * Finds all customers in an array that is bigger than a
     * specifiec customer and adds them to a new array, which
     * is returned.
     *
     * @param customers an array of customers.
     * @param customer the customer that is compared with.
     * @return an array of customers bigger than the
     * specified customer.
     */
    public static Customer[] biggerThanCustomer(Customer[] customers, Customer customer) {
        ArrayList<Customer> custList = new ArrayList<>();
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].compareTo(customer) > 0)
                custList.add(customers[i]);
        }

        Customer[] custArray = new Customer[custList.size()];
        for (int i = 0; i < custList.size(); i++) {
            custArray[i] = custList.get(i);
        }

        return custArray;
    }
}

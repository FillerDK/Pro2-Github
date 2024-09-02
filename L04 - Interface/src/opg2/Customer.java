package opg2;

public class Customer implements Comparable<Customer> {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Customer o) {
        int lastname = lastName.compareTo(o.lastName);
        if (lastname == 0) {
            int firstname = firstName.compareTo(o.firstName);
            if (firstname == 0) {
                return Integer.compare(age, o.age);
            } else {
                return firstname;
            }
        } else {
            return lastname;
        }
    }
}

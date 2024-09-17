package classex.ex1;

public class FullName implements Comparable<FullName> {
    // section a)
    private String firstname;
    private final String lastname;

    FullName(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }

    // section b)
    @Override
    public int compareTo(FullName o) {
        int firstName = firstname.compareTo(o.firstname);
        if (firstName > 0) return firstname.compareTo(o.firstname);
        else return lastname.compareTo(o.lastname);
    }
}

package classex.ex1;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>>{
    // section a)
    private final T name;

    public Person (T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "";
    }

    // section b)
    @Override
    public int compareTo(Person<T> o) {
        return name.compareTo(o.name);
    }
}

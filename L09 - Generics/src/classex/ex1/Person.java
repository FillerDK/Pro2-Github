package classex.ex1;

public class Person<T> implements Comparable<Person<T>>{
    // section a)
    private final T name;
    private final int age;

    public Person (T name, int age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Name: " + name + " (" + age + ")");
    }

    // section b)
    @Override
    public int compareTo(Person<T> o) {
        return ((Comparable<T>) this.name).compareTo(o.getName());
    }
}

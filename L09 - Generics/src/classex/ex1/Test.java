package classex.ex1;

public class Test {
    public static void main(String[] args) {
        // section a)
        Person<String> pS1 = new Person<>("Sune");
        Person<String> pS2 = new Person<>("Frank");

        Person<FullName> pF1 = new Person<>(new FullName("Søren", "Hansen"));
        Person<FullName> pF2 = new Person<>(new FullName("Mette", "Blomsterberg"));

        System.out.println(pS1);
        System.out.println(pF1);

        // section b)
        System.out.println(pS1.compareTo(pS2));
        System.out.println(pF1.compareTo(pF2));
    }
}

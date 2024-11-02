package DemoGenerics.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Per", "Jens", "Ulla"));
        printStrings(names);
        // print(names);
        System.out.println();

        ArrayList<Integer> numbers = new ArrayList<>(List.of(11, 12, 13));
        printIntegers(numbers);
        // print(numbers);
        System.out.println();
    }

    public static void printStrings(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + "  ");
        }
    }

    public static void printIntegers(ArrayList<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + "  ");
        }
    }

    public static <E> void print(ArrayList<E> list) {
        for (E element : list) {
            System.out.print(element + "  ");
        }
    }
}

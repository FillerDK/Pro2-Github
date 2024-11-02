package classex.ex2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Ex2 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList(
                "apple", "banana", "cherry", "date", "elderberry",
                "fig", "grape", "kiwi", "lemon", "orange"
        ));

        HashSet<String> set2 = new HashSet<>(Arrays.asList(
                "kiwi", "lemon", "mango", "nectarine", "orange",
                "papaya", "quince", "raspberry", "strawberry", "tangerine"
        ));

        HashSet<String> set3 = new HashSet<>(Arrays.asList(
                "banana", "grape", "mango", "peach", "quince",
                "raspberry", "starfruit", "tangerine", "watermelon", "fig"
        ));

        System.out.println(genericMethod(set1, set2));
        System.out.println();
        System.out.println(intersection(set1, set2));
        System.out.println();
        System.out.println(difference1(set1, set2));
        System.out.println();
        System.out.println(difference2(set1, set2));
        System.out.println();
        genericMethod(set1, set2, set3);
        System.out.println(set3);
    }

    public static <T, E> HashSet<T> genericMethod(HashSet<E> set1, HashSet<E> set2) {
        HashSet<T> result = new HashSet<>((Collection<? extends T>) set1);
        result.addAll((Collection<? extends T>) set2);
        return result;
    }

    public static <T, E> HashSet<T> intersection(HashSet<E> set1, HashSet<E> set2) {
        HashSet<T> result = new HashSet<>();
        for (E e : set1) {
            if (set2.contains(e)) {
                result.add((T) e);
            }
        }
        return result;
    }

    public static <T, E> HashSet<T> difference1(HashSet<E> set1, HashSet<E> set2) {
        HashSet<T> result = new HashSet<>();
        HashSet<T> total = new HashSet<>(genericMethod(set1, set2));
        HashSet<T> intersection = new HashSet<>(intersection(set1, set2));

        for (T t : total) {
            if (!intersection.contains(t)) {
                result.add(t);
            }
        }

        return result;
    }

    public static <T, E> HashSet<T> difference2(HashSet<E> set1, HashSet<E> set2) {
        HashSet<T> result = new HashSet<>();

        for (E e : set1) {
            if (!set2.contains(e)) {
                result.add((T) e);
            }
        }

        for (E e : set2) {
            if (!set1.contains(e)) {
                result.add((T) e);
            }
        }

        return result;
    }

    public static <E> void genericMethod(
            HashSet<E> set1, HashSet<E> set2, HashSet<E> set3) {
        set3.addAll(set1);
        set3.addAll(set2);
    }
}

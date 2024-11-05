package ex6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Integer[] nums = {13, 7, 48, 17, 24, 8, 5, 33};
        System.out.println("Ints before sorting:");
        System.out.println(Arrays.toString(nums));
        selectionSort(nums, Integer::compare);
        System.out.println("Ints after sorting:");
        System.out.println(Arrays.toString(nums));
        System.out.println();

        String[] strings = {"13", "7", "48", "17", "24", "8", "5", "33"};
        System.out.println("Strings before sorting:");
        System.out.println(Arrays.toString(strings));
        selectionSort(strings, (s1, s2) ->
                Character.compare(s1.charAt(s1.length()-1), s2.charAt(s2.length()-1)));
        System.out.println("Strings after sorting on last character:");
        System.out.println(Arrays.toString(strings));
    }

    public static <E> void selectionSort (E[] list, Comparator<? super E> comparator) {
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (comparator.compare(list[j], list[min]) < 0) {
                    min = j;
                }
            }
            if (min != 1) {
                E temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
    }
}

package ex6;

import java.util.Comparator;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = new String[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Type in a string: ");
            String str = input.nextLine();
            strings[i] = str;
        }

        selectionSort(strings, );
    }

    public static <E> void selectionSort (E[] list,
                                          Comparator<? super E> Comparator) {

    }
}

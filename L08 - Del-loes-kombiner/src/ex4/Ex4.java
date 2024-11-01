package ex4;

import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(8);
        ints.add(56);
        ints.add(45);
        ints.add(34);
        ints.add(15);
        ints.add(12);
        ints.add(34);
        ints.add(44);

        System.out.println(ints);
        mergesort(ints);
        System.out.println(ints);
    }

    public static void mergesort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }

    private static void mergesort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(list, low, middle);
            mergesort(list, middle + 1, high);
            merge(list, low, middle, high);
        }
    }

    private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        // flet list[low..middle] og list[middle+1..high] over i
        // en ny liste (temp) ved en total fletning

        int i1 = low;
        int i2 = middle + 1;
        while (i1 <= middle && i2 <= high) {
            int t1 = list.get(i1);
            int t2 = list.get(i2);

            if (t1 <= t2) {
                temp.add(t1);
                i1++;
            } else {
                temp.add(t2);
                i2++;
            }
        }

        while (i1 <= middle) {
            temp.add(list.get(i1));
            i1++;
        }

        while (i2 <= high) {
            temp.add(list.get(i2));
            i2++;
        }

        for (int i = low; i <= high; i++) {
            list.set(i, temp.get(i - low));
        }
    }
}



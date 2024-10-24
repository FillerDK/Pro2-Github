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
        while (i1 < middle + 1 && i2 < high) {
            int t1 = list.get(i1);
            int t2 = list.get(i2);

            if (Integer.compare(t1, t2) <= 0) {
                temp.add(t1);
                i1++;
            } else {
                temp.add(t2);
                i2++;
            }
        }

        while (i1 < middle + 1) {
            temp.add(list.get(i1));
            i1++;
        }

        while (i2 < high) {
            temp.add(list.get(i2));
            i2++;
        }
    }
}



/*
                            Merge sort tree
                      [13, 7, 48, 17, 24, 8, 5, 33]
                      //                        \\
                   (0, 3)                      (4, 7)
                   //                             \\
            [13, 7, 48, 17]                 [24, 8, 5, 33]
            //       \\                      //        \\
         (0, 1)     (2, 3)               (4, 5)       (6, 7)
         //            \\                 //             \\
     [13, 7]         [48, 17]         [24, 8]          [5, 33]
     --------------------------Merge---------------------------
         \\          //                    \\         //
        [7, 13, 17, 48]                   [5, 8, 24, 33]
                   \\                       //
                  [5, 7, 8, 13, 17, 24, 33, 48]
 */
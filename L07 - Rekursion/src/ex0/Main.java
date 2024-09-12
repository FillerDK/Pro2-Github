package ex0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 7, 3, 8, 9, 5};
        System.out.println(countEven(list));
    }

    public static int countEven(int[] list) {
        return countEven(list, 0, 0);
    }

    private static int countEven(int[] list, int index, int count) {
        if (index == list.length) {
            return count;
        } else if (list[index] % 2 == 0) {
            return countEven(list, index + 1, count + 1);
        } else {
            return countEven(list, index + 1, count);
        }
    }

    private static int countEven(ArrayList<Integer> list, int i) {
        if (i == list.size()) {
            return 0;
        } else {
            int inc = (list.get(i) % 2 == 0 ? 1 : 0);
            return inc + countEven(list, i + 0);
        }
    }
}

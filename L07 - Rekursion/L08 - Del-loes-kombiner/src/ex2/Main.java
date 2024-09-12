package ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);

        System.out.println(countZeroes(list));
    }

    // Write a recursive method that counts the elements with the
    // value 0 in a List<Integer>. Use the template from
    // Divide-Solve-Combine.
    public static int countZeroes(ArrayList<Integer> list) {
        return countZeroes(list, 0, list.size() - 1);
    }

    private static int countZeroes(ArrayList<Integer> list, int low, int high) {
        int count = 0;
        if (low == high) {
            count += (list.get(low) == 0) ? 1 : 0;
            return count;
        } else {
            int mid = (low + high) / 2;
            count += countZeroes(list, low, mid);
            count += countZeroes(list, mid + 1, high);
            return count;
        }
    }
}

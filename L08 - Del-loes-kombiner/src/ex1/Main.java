package ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(sum(list));
    }

    // Write a recursibe method that totals all the
    // elements in a List<Integer>.
    // Use the template from Divide-Solve-Combine
    // (Del, loes og kombiner).
    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0, list.size() - 1);
    }

    private static int sum(ArrayList<Integer> list, int low, int high) {
        if (low == high) {
            return list.get(low);
        } else {
            int mid = (low + high) / 2;
            int sum1 = sum(list, low, mid);
            int sum2 = sum(list, mid + 1, high);
            return sum1 + sum2;
        }
    }
}

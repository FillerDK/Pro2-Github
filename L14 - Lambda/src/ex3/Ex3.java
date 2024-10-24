package ex3;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        // section a)
        List<Integer> nums = Arrays.asList(4, 9, 10, 6, 18, 25, 3, 8);
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // section b)
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(2, 4);
        hashMap.put(3, 9);
        hashMap.put(4, 16);
        hashMap.put(5, 25);
        hashMap.put(6, 36);
        Iterator<Integer> iteratorMap = hashMap.keySet().iterator();
        while (iteratorMap.hasNext()) {
            int next = iteratorMap.next();
            System.out.printf("(%d, %d) ", next, hashMap.get(next));
        }
    }
}

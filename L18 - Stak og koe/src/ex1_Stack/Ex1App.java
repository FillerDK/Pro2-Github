package ex1_Stack;

public class Ex1App {

    public static void main(String[] args) {
        Stack24V<String> stack = new SingleLinkedStack24V<>();
//        Stack24V<String> stack = new ListStack24V<>();
//        Stack24V<String> stack = new ArrayStack24V<>();

        stack.push("Tom");
        stack.push("Diana");
        stack.push("Harry");
        stack.push("Thomas");
        stack.push("Bob");
        stack.push("Brian");
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty() + " " + stack.size());
        System.out.println();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();

        System.out.println(stack.isEmpty() + " " + stack.size());
        System.out.println();

        // -------- test of reverse --------

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    /** Reverse the table. */
    public static <E> void reverse(E[] table) {
        Stack24V<E> stack = new SingleLinkedStack24V<>();
        // Stack24V<E> stack = new ListStack24V<>();
        // Stack24V<E> stack = new ArrayStack23Y<E>();
        for (E e : table) {
            stack.push(e);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            table[i] = stack.pop();
            i++;
        }
    }
}

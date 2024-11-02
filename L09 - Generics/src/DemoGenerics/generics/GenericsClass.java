package DemoGenerics.generics;

import java.util.ArrayList;

public class GenericsClass {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ib");
        stack.push("Ulla");
        stack.push("Per");
        System.out.println("Stack: " + stack);
        System.out.println();

        String s = stack.pop();
        System.out.println("Popped " + s);
        System.out.println("Popped " + stack.pop());
        System.out.println("Stack: " + stack);

//        Stack<Integer> stack = new Stack<>();
//        stack.push(11); // auto boxing
//        stack.push(12);
//        stack.push(13);
//        System.out.println("Stack: " + stack);
//        System.out.println();
//
//        int e = stack.pop();  // auto unboxing
//        System.out.println("Popped " + e); //
//        System.out.println("Popped " + stack.pop());
//        System.out.println("Stack: " + stack);
    }
}

class Stack<E> {
    private final ArrayList<E> items = new ArrayList<>();

    /** Push an item to the top of the stack. */
    public void push(E item) {
        items.add(item);
    }

    /** Pop an item from the top of the stack.
     Throw exception, if the stack is empty */
    public E pop() {
        if (items.isEmpty()) throw new RuntimeException("Stack is empty");
        return items.removeLast();
    }

    @Override
    public String toString() {
        return items.toString();
    }
}

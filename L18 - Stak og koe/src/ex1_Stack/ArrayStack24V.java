package ex1_Stack;

// OPGAVE 1 med array.
public class ArrayStack24V<E> implements Stack24V<E> {
    // top is the index of the top element in the stack,
    // top is -1 if the stack is empty
    private int top = -1;
    // items contains the elements in the stack at index 0..top and null else
    @SuppressWarnings("unchecked")
    private E[] items = (E[]) new Object[4];

    /**
     * Add the element at the top of this stack.
     */
    @Override
    public void push(E entry) {

    }

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E pop() {

        return null;
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E peek() {

        return null;
    }

    /**
     * Return true, if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        // TODO
        return false;
    }

    /**
     * Remove all elements from this stack.
     */
    @Override
    public void clear() {

    }

    /**
     * Return the number of elements in this stack.
     */
    @Override
    public int size() {

        return 0;
    }

    @Override
    public String toString() {
        if (top == -1) return "[]";

        StringBuilder sb = new StringBuilder("[").append(items[0]);
        for (int i = 1; i <= top; i++) {
            sb.append(", ").append(items[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}

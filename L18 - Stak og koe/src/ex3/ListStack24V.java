package ex3;

import ex1_Stack.Stack24V;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ListStack24V<E> implements Stack24V<E> {
    // Implements a stack using a LinkedList.
    // The top of the stack is at the beginning of the LinkedList.

    // deque contains the elements in the stack.
    private final LinkedList<E> stack = new LinkedList<>();

    /**
     * Add the element at the top of this stack.
     */
    @Override
    public void push(E entry) {
        stack.push(entry);
    }

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E pop() {
        if (isEmpty()) throw new NoSuchElementException();

        return stack.pop();
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E peek() {
        if (isEmpty()) throw new NoSuchElementException();

        return stack.peek();
    }

    /**
     * Return true, if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Remove all elements from this stack.
     */
    @Override
    public void clear() {
        stack.clear();
    }

    /**
     * Return the number of elements in this stack.
     */
    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}

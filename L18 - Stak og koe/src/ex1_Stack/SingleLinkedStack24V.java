package ex1;

import java.util.NoSuchElementException;

// OPGAVE 1 med single-linked liste.
public class SingleLinkedStack24V<E> implements ex1.Stack24V<E> {
    // top of stack is at head of list
    private Node<E> head = null;
    // the number of element in the stack
    int size = 0;

    /**
     * Add the element at the top of this stack.
     */
    @Override
    public void push(E entry) {
        if (head == null) {
            head = new Node<>(entry);
            size++;
            return;
        }

        Node<E> node = new Node<>(entry);
        node.next = head;
        head = node;
        size++;
    }

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E pop() {
        if (head == null) throw new NoSuchElementException();

        Node<E> temp = head;
        head = head.next;
        size--;
        return temp.element;
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E peek() {
        if (head == null) throw new NoSuchElementException();

        return head.element;
    }

    /**
     * Return true, if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        if (size == 0) return true;

        return false;
    }

    /**
     * Removes all elements from this stack.
     */
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Return the number of elements in the stack.
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder sb = new StringBuilder("[").append(head.element);
        Node<E> node = head.next;
        while (node != null) {
            sb.append(", ").append(node.element);
            node = node.next;
        }
        sb.append("]");
        return sb.toString();
    }

    //-------------------------------------------------------------------------

    private static class Node<T> {
        final T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }
}

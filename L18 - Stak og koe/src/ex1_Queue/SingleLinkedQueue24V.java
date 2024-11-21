package ex1_Queue;

import java.util.NoSuchElementException;

public class SingleLinkedQueue24V<E> implements Queue24V<E> {
    // head points to the node at the front of the queue
    // (= the first node in the singly-linked list)
    private Node<E> head = null;

    // tail points to the node at the back of the queue
    // (= the last node in the singly-linked list)
    private Node<E> tail = null;

    // the number of elements
    int size = 0;

    /**
     * Add the element at the back of the queue.
     */
    @Override
    public void add(E element) {
        if (tail == null) {
            head = new Node<>(element);
            tail = head;
            size++;
            return;
        }

        Node<E> newNode = new Node<>(element);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    /**
     * Remove and return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E remove() {
        if (head == null) throw new NoSuchElementException();

        E element = head.element;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return element;
    }

    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E element() {
        if (isEmpty()) throw new NoSuchElementException();

        return head.element;
    }

    /**
     * Return true, if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Remove all elements from the queue.
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Return the number of elements in the queue.
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
        private final T element;
        private Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }
}

package ex1_Queue;

public class DoubleLinkedQueue24V<E> implements Queue24V<E> {
    // header.next points to the node at the front of the queue
    private Node<E> header = new Node<>(null);
    // trailer.prev points to the node at the back of the queue
    private Node<E> trailer = new Node<>(null);
    // size is the number of elements in the queue
    private int size = 0;

    public DoubleLinkedQueue24V() {
        header.next = trailer;
        trailer.prev = header;
    }

    /**
     * Add the element at the back of the queue.
     */
    @Override
    public void add(E element) {

    }

    /**
     * Remove and return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E remove() {

        return null;
    }

    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E element() {

        return null;
    }

    /**
     * Return true, if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return header.next == trailer;
    }

    /**
     * Remove all elements from the queue.
     */
    @Override
    public void clear() {
        header.next = trailer;
        trailer.prev = header;
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

        StringBuilder sb = new StringBuilder("[").append(header.next.element);
        Node<E> node = header.next.next;
        while (node != trailer) {
            sb.append(", ").append(node.element);
            node = node.next;
        }
        sb.append("]");
        return sb.toString();
    }

    private static class Node<T> {
        private final T element;
        private Node<T> next;
        private Node<T> prev;

        public Node(T element) {
            this.element = element;
        }
    }
}
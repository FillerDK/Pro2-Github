package ex1_Queue;

public interface Queue24V<E> {
    /**
     * Add the element at the back of the queue.
     */
    void add(E element);

    /**
     * Remove and return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    E remove();

    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    E element();

    /**
     * Return true, if the queue is empty.
     */
    boolean isEmpty();

    /**
     * Remove all elements from the queue.
     */
    void clear();

    /**
     * Return the number of elements in the queue.
     */
    int size();
}

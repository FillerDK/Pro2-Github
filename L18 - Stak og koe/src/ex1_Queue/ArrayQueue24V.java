package ex1_Queue;

import java.util.NoSuchElementException;

public class ArrayQueue24V<E> implements Queue24V<E> {
    // 0 is the index of the element at the front of the queue
    // size is the index of the first unused entry at the back of the queue,
    // size is also the number of elements in the queue
    private int size = 0;
    // items contains the elements in the queue at index 0..size-1 and null else
    @SuppressWarnings("unchecked")
    private E[] items = (E[]) new Object[4];

    /**
     * Add the element at the back of the queue.
     */
    @Override
    public void add(E element) {
        items[size] = element;
        size++;
    }

    /**
     * Remove and return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E remove() {
        if (isEmpty()) throw new NoSuchElementException();

        E e = items[0];
        for (int i = 0; i < size-1; i++) {
            items[i] = items[i+1];
        }
        items[size] = null;
        size--;

        return e;
    }

    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E element() {
        if (isEmpty()) throw new NoSuchElementException();

        return items[0];
    }

    /**
     * Return true, if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Remove all elements from the queue.
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
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

        StringBuilder sb = new StringBuilder("[").append(items[0]);
        for (int i = 1; i < size; i++) {
            sb.append(", ").append(items[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}

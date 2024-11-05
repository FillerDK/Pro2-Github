package classex.ex3;

import java.util.Random;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /** Create a bag with the given capacity. */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /** Create a bag with capacity 10. */
    public ArrayBag() {
		this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if (size < items.length) {
            items[size] = newEntry;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public E remove() {
        E ret = null;
        if (size > 0) {
            Random r = new Random();
            int ran = r.nextInt(1, size);
            ret = items[ran];
            items[ran] = null;
            size--;
        }
        return ret;
    }

    @Override
    public boolean remove(E anEntry) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry)) {
                // Shift elements to the left to fill the gap
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        size = 0;
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(E anEntry) {
        if (size > 0)
            for (int i = 0; i < size; i++) {
                if (items[i].equals(anEntry)) {
                    return true;
                }
            }
        return false;
    }

    @Override
    public E[] toArray() {
        E[] array = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = items[i];
        }
        return array;
    }
}

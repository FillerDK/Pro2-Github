package classex.ex4;

import java.util.ArrayList;

public class ArrayListRing<T> implements Ring<T> {
    // The ArrayList to hold items
    private final ArrayList<T> items;
    // Current item of the ring
    private T currentItem;

    public ArrayListRing() {
        this.items = new ArrayList<>();
    }

    @Override
    public void advance() {
        //TODO
    }

    @Override
    public T getCurrentItem() {
        if (currentItem != null) {
            return currentItem;
        } else {
            throw new EmptyRingException("The ring is empty!");
        }
    }

    @Override
    public void add(T item) {
        //TODO
    }

    @Override
    public boolean removeItem(T item) {
        //TODO
        return false;
    }

    @Override
    public T removeCurrentItem() {
        //TODO
        return null;
    }

    @Override
    public int size() {
        //TODO
        return 0;
    }

    @Override
    public boolean isEmpty() {
        //TODO
        return false;
    }
}

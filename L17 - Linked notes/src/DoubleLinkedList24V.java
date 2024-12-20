import java.util.Iterator;
import java.util.NoSuchElementException;

/** A double-linked nodes based implementation of the List ADT. */
public class DoubleLinkedList24V<E> implements List24V<E> {
    private final Node<E> header = new Node<>(null);
    private final Node<E> trailer = new Node<>(null);
    private int size = 0;

    public DoubleLinkedList24V() {
        header.next = trailer;
        trailer.prev = header;
    }

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        // insert newNode between trailer.prev and trailer
        newNode.prev = trailer.prev;
        newNode.next = trailer;
        trailer.prev.next = newNode;
        trailer.prev = newNode;
        size++;
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        if (size == 0) return false;

        Node<E> node = header.next;
        while (node.next != trailer) {
            if (node.element.equals(e)) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                size--;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    /**
     * Return true, if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        if (size == 0) return false;

        Node<E> node = header.next;
        while (node.next != trailer) {
            if (node.element.equals(e)) return true;
            node = node.next;
        }
        return false;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        header.next = trailer;
        trailer.prev = header;
        size = 0;
    }

    /**
     * Return the size of this list.
     */
    public int size() {
        return size;
    }

    /**
     * Return true, if this list is empty.
     */
    @Override
    public boolean isEmpty() {
        return header.next == trailer;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Node<E> node = header.next;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }

        return node.element;
    }

    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */
    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        Node<E> node = header.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        Node<E> newNode = new Node<>(e);
        // insert newNode between trailer.prev and trailer
        newNode.prev = node.prev;
        newNode.next = node;
        node.prev.next = newNode;
        node.prev = newNode;
        size++;
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E remove(int index) {
        // TODO
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Node<E> node = header.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        return node.element;
    }

    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        // TODO
        return -1;
    }

    /**
     * Return an iterator over this list.
     * Note: While the list is traversed by this iterator,
     * adding or removing an element is not allowed.
     */
    @Override
    public Iterator<E> iterator() {
        class MyIterator implements Iterator<E> {
            // the node with the element to be returned by next()
            Node<E> node = header.next;

            @Override
            public boolean hasNext() {
                return (node != null && !node.equals(trailer));
            }

            @Override public E next() {
                if (!this.hasNext()) throw new NoSuchElementException();

                E element = node.element;
                node = node.next;
                return element;
            }
        }
        return new MyIterator();
    }

    //-------------------------------------------

    private static class Node<T> {
        private final T element;
        private Node<T> next;
        private Node<T> prev;

        public Node(T t) {
            this.element = t;
            this.next = null;
            this.prev = null;
        }
    }

    //-------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> node = header.next;
        while (node != trailer) {
            sb.append(", ").append((node.element));
            node = node.next;
        }
        if (sb.length() > 1) sb.delete(1, 3);
        sb.append("]");
        return sb.toString();
    }
}

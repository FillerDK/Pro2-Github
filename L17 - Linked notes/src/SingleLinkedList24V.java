import java.util.Iterator;
import java.util.NoSuchElementException;

/** A single-linked nodes based implementation of the List ADT. */
public class SingleLinkedList24V<E> implements List24V<E> {
    private Node<E> head = null;
    private int size = 0;

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        if (head == null) {
            head = new Node<>(e);
            size++;
            return;
        }

        Node<E> node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<>(e);
        size++;
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        if (head == null) return false;

        if (head.element.equals(e)) {
            head = head.next;
            size--;
            return true;
        }

        Node<E> node = head;
        while (node.next != null) {
            if (node.next.element.equals(e)) {
                node.next = node.next.next;
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
        if (head == null) return false;

        if (head.element.equals(e)) return true;

        Node<E> node = head;
        while (node.next != null) {
            if (node.next.element.equals(e)) return true;
            node = node.next;
        }
        return false;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        head = null;
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
        return head == null;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        if (head == null) return null;

        if (index == 0) return head.element;

        Node<E> node = head;
        int i = 1;
        while (node.next != null) {
            if (index == i) return node.next.element;
            node = node.next;
            i++;
        }

        return null;
    }

    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */
    @Override
    public void add(int index, E e) {
        // TODO

        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if (index == 0) {
            if (head == null) {
                head = new Node<>(e);
                size++;
            } else {
                Node<E> temp = head;
                head = new Node<>(e);
                head.next = temp;
                size++;
            }
            return;
        }

        Node<E> node = head;
        int i = 1;
        while (i < index) {
            node = node.next;
            i++;
        }

        Node<E> temp = node.next;
        node.next = new Node<>(e);
        node.next.next = temp;
        size++;
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        Node<E> temp = node.next;
        node.next = node.next.next;
        size--;
        return temp.element;
    }

    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        if (head == null) return -1;

        if (head.element.equals(e)) return 0;

        Node<E> node = head;
        int i = 1;
        while (node.next != null) {
            if (node.next.element.equals(e)) return i;
            node = node.next;
            i++;
        }

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
            Node<E> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
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
        final T element;
        Node<T> next;

        public Node(T t) {
            this.element = t;
            this.next = null;
        }
    }

    //-------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> node = head;
        while (node != null) {
            sb.append(", ").append((node.element));
            node = node.next;
        }
        if (sb.length() > 1) sb.delete(1, 3);
        sb.append("]");
        return sb.toString();
    }
}

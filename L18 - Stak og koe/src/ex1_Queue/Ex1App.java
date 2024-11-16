package ex1_Queue;

import java.util.NoSuchElementException;

public class Ex1App {
    public static void main(String[] args) {
//        Queue24V<String> queue = new SingleLinkedQueue24V<>();
//        Queue24V<String> queue = new DoubleLinkedQueue24V<>();
        Queue24V<String> queue = new ArrayQueue24V<>();

        System.out.println("Empty queue = " + queue);

        queue.add("A");
        System.out.println("One element queue = " + queue);

        queue.add("B");
        System.out.println("two element queue = " + queue);

        queue.add("C");
        System.out.println("Three element queue = " + queue);
        System.out.println("queue.element() = " + queue.element());

        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.isEmpty() = " + queue.isEmpty());

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println("queue.element() = " + queue.element());

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println("queue.element() = " + queue.element());

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);

        System.out.println("queue.isEmpty() = " + queue.isEmpty());
        System.out.println("queue.size() = " + queue.size());

        try {
            System.out.println("Remove from empty queue:");
            queue.remove();
        } catch (NoSuchElementException ex) {
            System.out.println("NoSuchElementException thrown");
        }
        try {
            System.out.println("Element at head in empty queue:");
            queue.element();
        } catch (NoSuchElementException ex) {
            System.out.println("NoSuchElementException thrown");
        }

        queue.add("A");
        queue.add("B");
        System.out.println("queue = " + queue);
        queue.clear();
        System.out.println("After queue.clear():");
        System.out.println("queue = " + queue);
        System.out.println("queue.size() = " + queue.size());
    }
}

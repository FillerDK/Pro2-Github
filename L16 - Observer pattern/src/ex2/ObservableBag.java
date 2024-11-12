package ex2;

import java.util.*;
import java.util.function.Consumer;

public class ObservableBag implements Bag, Iterable<String> {
    // items in the bag
    private final Map<String, Integer> items = new HashMap<>();
    private final List<MyObserver> observers = new ArrayList<>();

    // bag interface
    @Override
    public void add(String s) {
        if (!items.containsKey(s)) items.put(s, 1);
        else items.put(s, items.get(s) + 1);
        notifyObservers();
    }

    @Override
    public void remove(String s) {
        if (items.get(s) > 1) items.put(s, items.get(s) - 1);
        else items.remove(s);
        notifyObservers();
    }

    @Override
    public int getCount(String s) {
        return items.getOrDefault(s, 0);
    }

    // get method
    public Map<String, Integer> getItems() {
        return new HashMap<>(items);
    }

    // observer pattern
    public void registerObserver(MyObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(MyObserver obs) {
        observers.remove(obs);
    }

    public void notifyObservers() {
        for (MyObserver obs : observers) {
            obs.update(this);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return items.keySet().iterator();
    }
}

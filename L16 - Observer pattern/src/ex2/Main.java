package ex2;

public class Main {
    public static void main(String[] args) {
        ObservableBag oBag1 = new ObservableBag();
        ObservableBag oBag2 = new ObservableBag();
        MyObserver obs1 = new MyObserver("Observer 1");
        MyObserver obs2 = new MyObserver("Observer 2");

        oBag1.registerObserver(obs1);
        oBag2.registerObserver(obs1);
        oBag1.registerObserver(obs2);

        oBag1.add("Apple");
        oBag1.add("Apple");
        oBag1.add("Banana");
        oBag1.add("Banana");
        oBag1.remove("Apple");
        oBag1.remove("Apple");

        oBag2.add("Laptop");
        oBag2.add("Keyboard");

        oBag1.removeObserver(obs2);

        oBag1.add("Cola");
    }
}

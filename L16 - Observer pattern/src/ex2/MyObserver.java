package ex2;

public class MyObserver implements Observer {

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(ObservableBag bag) {
        System.out.printf("""
                --------------------
                %s
                Bag updated
                """, name);
        for (String s : bag) {
            System.out.printf("%s: %d\n", s, bag.getCount(s));
        }
    }
}

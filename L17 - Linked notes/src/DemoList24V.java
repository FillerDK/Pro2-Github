import java.util.Iterator;

public class DemoList24V {

    public static void main(String[] args) {
        City paris = new City("Paris", 12_000_000);
        City rom = new City("Rom", 9_000_000);
        City london = new City("London", 9_000_000);
        City amsterdam = new City("Amsterdam", 7_000_000);
        City oslo = new City("Oslo", 1_200_000);

        List24V<City> list = new ArrayList24V<>();
//        List24V<City> list = new SingleLinkedList24V<>();
//        List24V<City> list = new DoubleLinkedList24V<>();
        list.add(0,paris);
        System.out.println(list);
        list.add(1,amsterdam);
        System.out.println(list);
        list.add(2,london);
        list.add(rom);
        list.add(oslo);

        System.out.println(list);

        System.out.println("Size: " + list.size());
        System.out.println();

        list.remove(rom);
        list.remove(0);

        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println();

        //---------------------------------------------------------------------

        System.out.println("Print list with iterator:");
        Iterator<City> it = list.iterator();
        while (it.hasNext()) {
            City city = it.next();
            System.out.println(city);
        }
        System.out.println();

        System.out.println("Print list with for-each:");
        for (City city : list) {
            System.out.println(city);
        }
    }
}

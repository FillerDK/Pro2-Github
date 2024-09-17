package classex.opg5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Supra", 1998, 200000, 2);

        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 1984, 50000, 649);

        Truck truck = new Truck("Ford", "150-Raptor", 2015, 50000, 2500);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(car);
        vehicles.add(motorcycle);
        vehicles.add(truck);

        for (Vehicle v : vehicles) {
            v.start();
            if (v instanceof Truck) System.out.println("Rumbling engine...");
            else System.out.println("Vroom vroom!");
            v.stop();
            v.performAction();
            System.out.println();
        }
    }
}

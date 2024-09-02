package classex.opg5;

public class Truck extends Vehicle {
    private final double loadCapacity;

    public Truck(String make, String model, int year, double mileage, double loadCapacity) {
        super(make, model, year, mileage);
        this.loadCapacity = loadCapacity;
    }
}

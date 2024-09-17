package classex.opg5;

public class Truck extends Vehicle {
    private final double loadCapacity; // The load capacity of the truck.

    public Truck(String make, String model, int year, double mileage, double loadCapacity) {
        super(make, model, year, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load capacity: " + loadCapacity);
    }

    @Override
    void start() {
        System.out.println("Starting the Truck...");
    }

    @Override
    void stop() {
        System.out.println("Stopping the Truck...");
    }

    @Override
    void action() {
        System.out.println("Activating hydralic lift!");
    }
}

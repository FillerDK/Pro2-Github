package classex.opg5;

public class Motorcycle extends Vehicle {
    private final int engineSize; // The engine size in cubic centimeters.

    public Motorcycle(String make, String model, int year, double mileage, int engineSize) {
        super(make, model, year, mileage);
        this.engineSize = engineSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Engine size: " + engineSize);
    }

    @Override
    void start() {
        System.out.println("Startubg the Motorcycle...");
    }

    @Override
    void stop() {
        System.out.println("Stopping the Motorcycle...");
    }

    @Override
    void action() {
        System.out.println("Revving the engine!");
    }
}

package classex.opg5;

public class Car extends Vehicle {
    private final int numDoors; // The number of doors on the car.

    Car(String make, String model, int year, double mileage, int numDoors) {
        super(make, model, year, mileage);
        this.numDoors = numDoors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }

    @Override
    void start() {
        System.out.println("Starting the Car...");
    }

    @Override
    void stop() {
        System.out.println("Stopping the car...");
    }

    @Override
    void action() {
        System.out.println("Honking the horn!");
    }
}

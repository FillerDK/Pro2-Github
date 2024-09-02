package classex.opg5;

public class Car extends Vehicle {
    private final int numDoors;

    Car(String make, String model, int year, double mileage, int numDoors) {
        super(make, model, year, mileage);
        this.numDoors = numDoors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }
}

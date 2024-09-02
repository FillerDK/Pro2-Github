package classex.opg5;

public class Vehicle {
    private final String make;
    private final String model;
    private final int year;
    private final double mileage;

    Vehicle(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    void displayInfo() {
        System.out.printf("""
                Make: %s
                Model: %s
                Year: %d
                Mileage: %.2f
                """, make, model, year, mileage);
    }

    void start() {
        System.out.println("Vehicle engine started running!");
    }

    void stop() {
        System.out.println("Vehicle engine stopped running!");
    }

    void performAction() {
        this.action();
    }

    void action() {}
}

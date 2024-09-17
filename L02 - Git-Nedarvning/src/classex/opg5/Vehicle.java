package classex.opg5;

public class Vehicle {
    private final String make; // The make of the vehicle (e.g., "Toyota", "Ford", etc.).
    private final String model; // The model of the vehicle (e.g., "Camry", "Focus", etc.).
    private final int year; // The manufacturing of the vehicle.
    private final double mileage; // The current mileage of the vehicle.

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

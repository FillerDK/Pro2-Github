package opg1;

import java.util.ArrayList;

public abstract class Employee {
    private final String navn;
    private final String adresse;
    private final int ugentligeTimer;
    private final double timelønssats;

    public Employee(String navn, String adresse, int ugentligeTimer, double timelønssats) {
        this.navn = navn;
        this.adresse = adresse;
        this.ugentligeTimer = ugentligeTimer;
        this.timelønssats = timelønssats;
    }

    public double weeklySalary() {
        return timelønssats * ugentligeTimer;
    }
}

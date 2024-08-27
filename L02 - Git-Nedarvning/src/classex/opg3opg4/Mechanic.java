package classex.opg3opg4;

public class Mechanic extends Person {
    private final int svendeprøveÅr;
    private final double timelønssats;
    private final int ugentligeTimer = 37;

    public Mechanic (String navn, String adresse,
                     int svendeprøveÅr, double timelønssats) {
        super(navn, adresse);
        this.svendeprøveÅr = svendeprøveÅr;
        this.timelønssats = timelønssats;
    }

    public double weeklySalary() {
        return timelønssats * ugentligeTimer;
    }
}

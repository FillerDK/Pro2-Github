package classex.opg3;

public class Mechanic extends Person {
    private final int svendeprøveÅr;
    private final int timelønssats;

    public Mechanic (String navn, String adresse,
                     int svendeprøveÅr, int timelønssats) {
        super(navn, adresse);
        this.svendeprøveÅr = svendeprøveÅr;
        this.timelønssats = timelønssats;
    }

    public int weeklySalary() {
        return timelønssats * 37;
    }
}

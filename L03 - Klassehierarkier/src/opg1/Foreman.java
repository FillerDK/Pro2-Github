package opg1;

public class Foreman extends Employee {
    private final int svendeprøveÅr;
    private final int udnævnelsesÅr;
    private final double ugeTillæg;

    public Foreman(String navn, String adresse, int ugentligeTimer, double timelønssats,
                   int svendeprøveÅr, int udnævnelsesÅr, double ugeTillæg) {
        super(navn, adresse, ugentligeTimer, timelønssats);
        this.svendeprøveÅr = svendeprøveÅr;
        this.udnævnelsesÅr = udnævnelsesÅr;
        this.ugeTillæg = ugeTillæg;
    }

    public double weeklySalary() {
        return super.weeklySalary() + ugeTillæg;
    }
}

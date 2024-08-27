package classex.opg3opg4;

public class Foreman extends Mechanic {
    private final int udnævnelsesÅr;
    private final double ugeTillæg;

    public Foreman (String navn, String adresse,
                    int svendeprøveÅr, double timelønssats,
                    int udnævnelsesÅr, double ugeTillæg) {
        super(navn, adresse, svendeprøveÅr, timelønssats);
        this.udnævnelsesÅr = udnævnelsesÅr;
        this.ugeTillæg = ugeTillæg;
    }

    public double weeklySalary() {
        return super.weeklySalary() + ugeTillæg;
    }
}

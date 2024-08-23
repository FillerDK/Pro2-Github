package classex.opg3;

public class Foreman extends Mechanic {
    private final int udnævnelsesÅr;
    private final int ugeTillæg;

    public Foreman (String navn, String adresse,
                    int svendeprøveÅr, int timelønssats,
                    int udnævnelsesÅr, int ugeTillæg) {
        super(navn, adresse, svendeprøveÅr, timelønssats);
        this.udnævnelsesÅr = udnævnelsesÅr;
        this.ugeTillæg = ugeTillæg;
    }

    public int weeklySalary() {
        return super.weeklySalary() + ugeTillæg;
    }
}

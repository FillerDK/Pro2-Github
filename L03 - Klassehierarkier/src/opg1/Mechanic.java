package opg1;

public class Mechanic extends Employee {
    private final int svendeprøveÅr;

    public Mechanic(String navn, String adresse, double timelønssats, int svendeprøveÅr) {
        super(navn, adresse, 37, timelønssats);
        this.svendeprøveÅr = svendeprøveÅr;
    }
}

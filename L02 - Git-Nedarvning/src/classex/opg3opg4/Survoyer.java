package classex.opg3opg4;

public class Survoyer extends Mechanic {
    private static final int syntillæg = 29;
    private int ugentligAntalSyn;

    public Survoyer(String navn, String adresse, int svendeprøveÅr, double timelønssats) {
        super(navn, adresse, svendeprøveÅr, timelønssats);
    }

    public void addSyn(int antalsyn) {
        ugentligAntalSyn += antalsyn;
    }

    public double weeklySalary() {
        double syntillæg = this.syntillæg * ugentligAntalSyn;
        return super.weeklySalary() + syntillæg;
    }
}

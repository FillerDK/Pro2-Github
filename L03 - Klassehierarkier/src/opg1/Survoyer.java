package opg1;

public class Survoyer extends Mechanic {
    private static final int syntillæg = 29;
    private int ugentligAntalSyn;

    public Survoyer(String navn, String adresse, double timelønssats, int svendeprøveÅr) {
        super(navn, adresse, timelønssats, svendeprøveÅr);
    }

    public void addSyn(int antalsyn) {
        ugentligAntalSyn += antalsyn;
    }

    @Override
    public double weeklySalary() {
        double syntillæg = this.syntillæg * ugentligAntalSyn;
        return super.weeklySalary() + syntillæg;
    }
}

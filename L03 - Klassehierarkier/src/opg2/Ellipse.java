package opg2;

public class Ellipse extends Figur {
    private final double storAkse;
    private final double lilleAkse;

    public Ellipse(double xKoordinat, double yKoordinat, double storAkse, double lilleAkse) {
        super(xKoordinat, yKoordinat, "Ellipse");
        this.storAkse = storAkse;
        this.lilleAkse = lilleAkse;
    }

    @Override
    public double area() {
        double areal = 0;

        areal = Math.PI * storAkse * lilleAkse;

        return areal;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                Stor akse: %.4f
                Lille akse: %.4f
                -------------------
                """, storAkse, lilleAkse);
    }
}

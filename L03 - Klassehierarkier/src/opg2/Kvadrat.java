package opg2;

public class Kvadrat extends Figur {
    private final double sidelængde;

    public Kvadrat(double xKoordinat, double yKoordinat, double sidelængde) {
        super(xKoordinat, yKoordinat, "Kvadrat");
        this.sidelængde = sidelængde;
    }

    @Override
    public double area() {
        double areal = 0;

        areal = Math.pow(sidelængde, 2);

        return areal;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                        Sidelængde: %.4f
                        -------------------
                        """, sidelængde);
    }
}

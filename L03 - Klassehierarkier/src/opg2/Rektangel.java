package opg2;

public class Rektangel extends Figur {
    private final double højde;
    private final double bredde;

    public Rektangel(double xKoordinat, double yKoordinat, double højde, double bredde) {
        super(xKoordinat, yKoordinat, "Rektangel");
        this.højde = højde;
        this.bredde = bredde;
    }

    @Override
    public double area() {
        double areal = 0;

        areal = højde * bredde;

        return areal;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                Højde: %.4f
                Bredde: %.4f
                -------------------
                """, højde, bredde);
    }
}

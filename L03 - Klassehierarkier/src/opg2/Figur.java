package opg2;

public abstract class Figur {
    private double xKoordinat;
    private double yKoordinat;
    private final String navn;

    public Figur(double xKoordinat, double yKoordinat, String navn) {
        this.xKoordinat = xKoordinat;
        this.yKoordinat = yKoordinat;
        this.navn = navn;
    }

    public abstract double area();

    public void parallelforskyd(int dx, int dy) {
        xKoordinat += dx;
        yKoordinat += dy;
    }

    @Override
    public String toString() {
        return String.format("""
                Navn: %s
                x koordinat: %.4f
                y koordinat: %.4f
                Areal: %.4f
                """, navn, xKoordinat, yKoordinat, this.area());
    }
}
package opg2;

public class Cirkel extends Figur {
    private final double radius;

    public Cirkel(double xKoordinat, double yKoordinat, double radius) {
        super(xKoordinat, yKoordinat, "Cirkel");
        this.radius = radius;
    }

    @Override
    public double area() {
        double areal = 0;

        areal = Math.PI * Math.pow(radius, 2);

        return areal;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                Radius: %.4f
                -------------------
                """, radius);
    }
}

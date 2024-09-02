package opg1;

public class Beer implements Measurable {
    private final String navn;
    private final double alkoholProcent;

    public Beer(String navn, double alkoholProcent) {
        this.navn = navn;
        this.alkoholProcent = alkoholProcent;
    }

    @Override
    public double getMeasure() {
        return alkoholProcent;
    }

    @Override
    public String toString() {
        return String.format("""
                --------------------
                Øl
                Navn: %s
                Alkohol = %.1f
                --------------------
                """, navn, alkoholProcent);
    }
}

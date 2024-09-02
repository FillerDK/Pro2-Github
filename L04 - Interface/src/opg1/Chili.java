package opg1;

public class Chili implements Measurable {
    private final String navn;
    private final int styrke; // scoville 1 - 2.000.000

    public Chili(String navn, int styrke) {
        this.navn = navn;
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public int getStyrke() {
        return styrke;
    }


    @Override
    public double getMeasure() {
        return styrke;
    }

    @Override
    public String toString() {
        return String.format("""
                --------------------
                Chili
                Navn: %s
                Styrke: %d
                --------------------
                """, navn, styrke);
    }
}

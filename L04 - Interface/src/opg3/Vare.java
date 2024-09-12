package opg3;

public class Vare {
    private final double pris; //excl. moms
    private final String navn;
    private final String beskrivelse;

    public Vare(double pris, String navn, String beskrivelse) {
        this.pris = pris;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }

    public double getPris() {
        return pris;
    }

    public double beregnSalgspris() {
        return pris * 1.25;
    }

    @Override
    public String toString() {
        return String.format("""
                ---------------------------------------------
                Varenavn:           %s
                Beskrivelse:        %s
                Pris:               %.2f
                """, navn, beskrivelse, pris);
    }
}

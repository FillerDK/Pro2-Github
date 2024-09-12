package opg3;

public class Spiritus extends Vare {
    private final double alkoholProcent;

    public Spiritus(double pris, String navn, String beskrivelse, double alkoholProcent) {
        super(pris, navn, beskrivelse);
        this.alkoholProcent = alkoholProcent;
    }

    /**
     * Beregner salgsprisen for spiritus (pris + moms).
     *
     * @return salgspris + moms (80%, hvis nettopris > 90kr, så 120%)
     */
    @Override
    public double beregnSalgspris() {
       double salgspris;
       double pris = super.getPris();

       if (pris > 90)
           salgspris = pris * 2.20;
       else
           salgspris = pris * 1.80;

       return salgspris;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                Alkoholprocent:     %.1f
                ---------------------------------------------
                """, alkoholProcent);
    }
}

package opg3;

public class Fødevare extends Vare {
    private final int holdbarhedsperiode; // antal dage

    public Fødevare(double pris, String navn, String beskrivelse, int holdbarhedsperiode) {
        super(pris, navn, beskrivelse);
        this.holdbarhedsperiode = holdbarhedsperiode;
    }

    /**
     * Beregner salgsprisen for en fødevare (pris + moms).
     *
     * @return salgspris, pris + moms (5%)
     */
    @Override
    public double beregnSalgspris() {
        return super.getPris() * 1.05;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                Holdbarhedsperiode: %s
                ---------------------------------------------
                """, holdbarhedsperiode);
    }
}

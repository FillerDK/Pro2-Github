package opg3;

public class ElArtikel extends Vare {
    /**
     * Står for: "Gennemsnitlig energi forbrug per time" (kWh).
     */
    private final double gnsEFprT;

    public ElArtikel(double pris, String navn, String beskrivelse, double gnsEFprT) {
        super(pris, navn, beskrivelse);
        this.gnsEFprT = gnsEFprT;
    }

    /**
     * Beregner salgsprisen for en elartikel (pris + moms).
     *
     * @return salgsprisen + moms (30%, min. 3kr)
     */
    @Override
    public double beregnSalgspris() {
        double salgspris;
        double moms = super.getPris() * 0.30;

        if (moms < 3)
            salgspris = super.getPris() + 3;
        else
            salgspris = super.getPris() + moms;

        return salgspris;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                Gns. forbrug/t :    %.4f
                ---------------------------------------------
                """, gnsEFprT);
    }
}

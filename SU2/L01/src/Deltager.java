import java.util.ArrayList;

public class Deltager {
    private final String navn;
    private final String adresse;
    private final String mobil;
    private final String email;
    private final ArrayList<Tur> ture = new ArrayList<>();

    public Deltager(String navn, String adresse, String mobil, String email) {
        this.navn = navn;
        this.adresse = adresse;
        this.mobil = mobil;
        this.email = email;
    }

    public int beregnKørteKm() {
        int deltagerKm = 0;

        for (Tur t : ture) {
            deltagerKm += t.hentKm();
        }

        return deltagerKm;
    }
}

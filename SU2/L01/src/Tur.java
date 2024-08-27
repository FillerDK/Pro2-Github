import java.time.LocalDate;

public class Tur {
    private final String fra;
    private final String til;
    private final LocalDate dato;
    private final int antalKm;
    private final boolean fritid;

    public Tur(String fra, String til, LocalDate dato, int antalKm, boolean fritid) {
        this.fra = fra;
        this.til = til;
        this.dato = dato;
        this.antalKm = antalKm;
        this.fritid = fritid;
    }

    public int hentKm() {
        return antalKm;
    }
}

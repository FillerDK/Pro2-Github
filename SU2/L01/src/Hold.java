import java.util.ArrayList;

public class Hold {
    private final String navn;
    private final ArrayList<Deltager> deltagere = new ArrayList<>();

    public Hold(String navn) {
        this.navn = navn;
    }

    public int beregnHoldetsKm() {
        int holdKm = 0;

        for (Deltager d : deltagere) {
            holdKm += d.beregnKørteKm();
        }

        return holdKm;
    }
}

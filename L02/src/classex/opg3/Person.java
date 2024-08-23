package classex.opg3;

import java.util.ArrayList;

public class Person {
    private final String navn;
    private final String adresse;

    public Person (String navn, String adresse){
        this.navn = navn;
        this.adresse = adresse;
    }

    /**
     *Return the total weekly salary for the mechanics.
     */
    public static double totalWeeklySalary(ArrayList<Mechanic> list) {
        double total = 0;

        for (Mechanic m : list) {
            total += m.weeklySalary();
        }

        return total;
    }
}

package classex.opg3opg4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Mechanic> mekanikere = new ArrayList<>();

        mekanikere.add(new Mechanic("Søren", "Vinkevej 2", 1996, 210));
        mekanikere.add(new Mechanic("Ikke Søren", "Ikke Vinkevej 2", 2000, 200));
        mekanikere.add(new Mechanic("Måske Søren", "Måske Vinkevej 2", 2010, 190));

        mekanikere.add(new Foreman("Sune", "Samsøvej 47", 1975, 220, 2000, 3500));
        mekanikere.add(new Foreman("Johnny", "Hus 5", 1987, 230, 1995, 4000));

        Survoyer s1 = new Survoyer("Suv1", "Suvej2", 1989, 215);
        s1.addSyn(2);
        mekanikere.add(s1);
        mekanikere.add(new Survoyer("Suv2", "Suvej3", 1993, 207));

        System.out.println("Samlet løn er: " + totalWeeklySalary(mekanikere));
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

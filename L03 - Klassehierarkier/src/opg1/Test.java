package opg1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> mekanikere = new ArrayList<>();

        mekanikere.add(new Mechanic("Søren", "Vinkevej 2", 1996, 210));
        mekanikere.add(new Mechanic("Ikke Søren", "Ikke Vinkevej 2", 2000, 200));
        mekanikere.add(new Mechanic("Måske Søren", "Måske Vinkevej 2", 2010, 190));

        mekanikere.add(new Foreman("Sune", "Samsøvej 47", 3500, 1975, 220, 37, 2000));
        mekanikere.add(new Foreman("Johnny", "Hus 5", 4000, 1987, 230, 37, 1995));

        Survoyer s1 = new Survoyer("Suv1", "Suvej2", 215, 1989);
        s1.addSyn(2);
        mekanikere.add(s1);
        mekanikere.add(new Survoyer("Suv2", "Suvej3", 207, 1993));

        mekanikere.add(new WorkingBoy("WB1", "Vej 5", 175));

        System.out.println("Samlet ugeløn er: " + totalWeeklySalary(mekanikere));
    }

    /**
     *Return the total weekly salary for the mechanics.
     */
    public static double totalWeeklySalary(ArrayList<Employee> list) {
        double total = 0;

        for (Employee m : list) {
            total += m.weeklySalary();
        }

        return total;
    }
}

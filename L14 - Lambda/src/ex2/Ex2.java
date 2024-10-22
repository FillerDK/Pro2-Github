package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        System.out.println(runners);
        System.out.println();
        System.out.println("a)");
        runners.forEach(r -> System.out.println(r.toString()));
        System.out.println();
        System.out.println("b)");
        runners.forEach(r -> {
            if (r.getLapTime() < 30)
                System.out.println(r.toString());
        });
        System.out.println();
        System.out.println("c)");
        Collections.sort(runners, Comparator.comparing(Runner::getLapTime));
        System.out.println(runners);
    }
}
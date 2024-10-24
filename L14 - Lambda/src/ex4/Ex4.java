package ex4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex4 {

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

        // OBS: Throws exception.
        Iterator<Runner> runnerIterator = runners.iterator();
        while (runnerIterator.hasNext()) {
            Runner runner = runnerIterator.next();
            if (runner.getLapTime() >= 40) {
                runners.remove(runner);
                runnerIterator.remove();
            }
        }
        System.out.println(runners);
        System.out.println();
    }
}
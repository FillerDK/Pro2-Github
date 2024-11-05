package ex4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

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

        // opg. b
        // OBS: Throws exception.
        Iterator<Runner> runnerIterator = runners.iterator();
        while (runnerIterator.hasNext()) {
            Runner runner = runnerIterator.next();
            if (runner.getLapTime() >= 40) {
                runnerIterator.remove();
            }
        }
        System.out.println(runners);

        // opg. d
        /**
        System.out.println();
        Predicate<Runner> filterD = r -> r.getLapTime() >= 40;
        System.out.println(removeIf(runners, filterD));
        System.out.println(runners);
        */

        // opg. e
        Predicate<Runner> filterE = r -> r.getLapTime() >= 40;
        runners.removeIf(filterE);
        System.out.println(runners);
    }

    // opg. c
    /**
     * Remove runners that satifsies the given filter.
     * Return true, if any runner is removed.
     */
    public static boolean removeIf(
            List<Runner> runners, Predicate<Runner> filter) {
        //TODO
        return runners.removeIf(filter);
    }
}
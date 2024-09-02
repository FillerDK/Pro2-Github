package opg1;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Chilies
        Measurable[] chilies = new Measurable[4];

        Chili c1 = new Chili("Ik så stærk chili", 10);
        Chili c2 = new Chili("Nogen kalder mig stærk", 1000);
        Chili c3 = new Chili("Den er stærk", 25000);
        Chili c4 = new Chili("Ik spis den her (Jonathan's chili)", 1500000);

        chilies[0] = c1;
        chilies[1] = c2;
        chilies[2] = c3;
        chilies[3] = c4;

        // Beers
        Measurable[] beers = new Measurable[4];

        Beer b1 = new Beer("Go' bajer", 4.6);
        Beer b2 = new Beer("Alkoholfri", 0.0);
        Beer b3 = new Beer("'Jeg skal være fuld'", 9.7);
        Beer b4 = new Beer("Mild øl", 2.1);

        beers[0] = b1;
        beers[1] = b2;
        beers[2] = b3;
        beers[3] = b4;

        // Udskrifter
        System.out.printf("Gennemsnits styrken er: %.1f \n\n", average(chilies));
        System.out.printf("Den stærkeste chili er\n%s\n", max(chilies));
        System.out.println("Black friday meal'en lyder på:");
        System.out.println(Arrays.toString(blackFridayMeal(chilies, beers)));

        Filter filter = new Hopper5000();
        System.out.println(average(chilies, filter));
    }

    public static double average(Measurable[] objects) {
        double num = 0;

        for (Measurable obj : objects) {
            num += obj.getMeasure();
        }

        double average = num / objects.length;
        return average;
    }

    public static double average(Measurable[] objects, Filter filter) {
        double num = 0;
        int count = 0;

        for (Measurable obj : objects) {
            if (filter.accept(obj)) {
                num += obj.getMeasure();
                count++;
            }
        }

        return num / count;
    }

    public static Measurable max(Measurable[] objects) {
        Measurable max = objects[0];

        for (Measurable obj : objects) {
            if (obj.getMeasure() > max.getMeasure()) {
                max = obj;
            }
        }

        return max;
    }

    public static Measurable[] blackFridayMeal(Measurable[] chilies, Measurable[] beers) {
        Measurable[] meal = new Measurable[2];

        meal[0] = max(chilies);
        meal[1] = max(beers);

        return meal;
    }
}

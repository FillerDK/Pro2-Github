package classexes;

import java.util.Arrays;
import java.util.Scanner;

public class Opg5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast et antal navne du ønsker: ");

        int namesNo = input.nextInt();
        int rows = namesNo;
        int cols = 2; // salgstal & stjerner
        int[][] nums = new int[rows][cols];
        String[] names = new String[namesNo];

        for (int i = 0; i < namesNo; i++) {
            System.out.print("Indtast navn på virksomhed efterfulgt af salgstal: ");
            names[i] = input.next();
            nums[i][0] = input.nextInt();
        }

        starsCalc(nums);

        printDiagram(nums, names);
    }

    public static int maxSales(int[][] nums) {
        int max = 0;

        for (int[] d : nums) {
            if (d[0] > max)
                max = d[0];
        }

        return max;
    }

    public static void starsCalc(int[][] nums) {
        int maxSales = maxSales(nums);
        for (int i = 0; i < nums.length; i++) {
            double salesnum = nums[i][0];
            int stars = (int) (salesnum / maxSales * 40);
            nums[i][1] = stars;
        }
    }

    public static void printDiagram(int[][] nums, String[] names) {
        for (int row = 0; row < nums.length; row++) {
            System.out.printf("%s\t", names[row]);
            for (int stars = 0; stars < nums[row][1]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

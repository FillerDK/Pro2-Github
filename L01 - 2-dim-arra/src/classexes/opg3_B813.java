package classexes;

import java.util.Arrays;
import java.util.Scanner;

public class opg3_B813 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");

        double[][] a = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array:");
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = input.nextDouble();
            }
        }

        System.out.println("The location of the smallest element is at " +
                Arrays.toString(locateSmallest(a)));
    }

    public static int[] locateSmallest(double[][] a){
        int[] location = new int[2];
        double smallest = a[0][0];

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] < smallest) {
                    smallest = a[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }
}

package classexes;

import java.util.Scanner;

public class opg3_B82 {
    public static void main(String[] args) {
        double[][] m = new double[4][4];
        System.out.println(averageMajorDiagonal(m));
    }

    // section 8.2
    public static double averageMajorDiagonal(double[][] m) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 4-by-4 matrix row by row:");

        double sum = 0;
        int count = 0;

        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = input.nextDouble();
                if (row == col) {
                    sum += m[row][col];
                    count++;
                }
            }
        }

        return sum / count;
    }
}

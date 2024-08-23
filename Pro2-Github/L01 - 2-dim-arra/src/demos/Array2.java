package demos;

import java.util.Arrays;

public class Array2 {

    public static void main(String[] args) {
        int[][] table = new int[7][5]; // 7 rows, 5 columns

        table[5][3] = 7;

        // 0 <= row < table.length
        // table length is 7

        // 0 <= column < table[row].length,
        // table[row].length is 5 for all rows

        // print table
        System.out.println("table:");
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                //table[row][col] = row * 5 + col;
                System.out.printf("%3d", table[row][col]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] ragged = new int[4][]; // 4 rows, columns not defined yet
        // define columns
        ragged[0] = new int[5];
        ragged[1] = new int[4];
        ragged[2] = new int[5];
        ragged[3] = new int[2];
//        ragged[3] = new int[]{40, 41};

        // fill ragged
        for (int row = 0; row < ragged.length; row++) {
            for (int col = 0; col < ragged[row].length; col++) {
                ragged[row][col] = (row + 1) * 10 + col;
            }
        }

        // print ragged
        System.out.println("ragged:");
        for (int row = 0; row < ragged.length; row++) {
            for (int col = 0; col < ragged[row].length; col++) {
                System.out.printf("%3d", ragged[row][col]);
            }
            System.out.println();
        }
        System.out.println();

        for (int[] rowInTable : ragged) {
            System.out.println(Arrays.toString(rowInTable));
        }
    }
}

package classexes;

public class opg2 {
    public static void main(String[] args) {
        int[][] numbers = {{0,4,3,9,6},
                           {1,3,5,2,2},
                           {3,3,1,0,1},
                           {0,0,9,7,1}};

        //replaceAllWithX(numbers, 5);
        //replaceEvenAndUnevenRow(numbers, 2, 3);
        //replaceEvenAndUnevenColumn(numbers, 2, 3);
        //chessPattern(numbers, 0, 1);
        //replaceFirstXLastY(numbers, 5, 2);
        print(numbers);
    }

    public static void print(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++){
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.printf("%2d ", numbers[row][col]);
            }
            System.out.println();
        }
    }

    // section opg 2.1
    public static void replaceAllWithX(int[][] numbers, int value) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = value;
            }
        }
    }

    // section opg 2.2
    public static void replaceEvenAndUnevenRow(int[][] numbers, int even, int uneven) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (row % 2 == 0) {
                    numbers[row][col] = even;
                } else {
                    numbers[row][col] = uneven;
                }
            }
        }
    }

    // section opg 2.3
    public static void replaceEvenAndUnevenColumn(int[][] numbers, int even, int uneven) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (col % 2 == 0) {
                    numbers[row][col] = even;
                } else {
                    numbers[row][col] = uneven;
                }
            }
        }
    }

    // section opg 2.4
    public static void chessPattern(int[][] numbers, int val1, int val2) {
        int count = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (count % 2 == 0) {
                    numbers[row][col] = val1;
                } else {
                    numbers[row][col] = val2;
                }
                count++;
            }
        }
    }

    // section opg 2.5
    public static void replaceFirstXLastY(int[][] numbers, int outerVal, int innerVal) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (row == 0 || row == numbers.length-1
                        || col == 0 || col == numbers[row].length-1) {
                    numbers[row][col] = outerVal;
                } else {
                    numbers[row][col] = innerVal;
                }
            }
        }
    }
}

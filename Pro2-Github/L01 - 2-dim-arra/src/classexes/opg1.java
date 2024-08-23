package classexes;

public class opg1 {
    // section opg 1.1
    public static void main(String[] args) {
        int[][] numbers = {{0,4,3,9,6},
                           {1,3,5,2,2},
                           {3,3,1,0,1},
                           {0,0,9,7,1}};
        //print(numbers);
        //System.out.println(sumRow(numbers, 0));
        //System.out.println(sumColumn(numbers, 0));
        System.out.println(sum(numbers));
    }

    // section opg 1.2
    public static void print(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++){
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.printf("%2d ", numbers[row][col]);
            }
            System.out.println();
        }
    }

    // section opg 1.3.1
    public static int sumRow(int[][] numbers, int row) {
        int total = 0;

        for (int col = 0; col < numbers[row].length; col++) {
            total += numbers[row][col];
        }

        return total;
    }

    // section opg 1.3.2
    public static int sumColumn(int[][] numbers, int col) {
        int total = 0;

        for (int row = 0; row < numbers.length; row++) {
            total += numbers[row][col];
        }

        return total;
    }

    // section opg 1.4
    public static int sum(int[][] numbers) {
        int total = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                total += numbers[row][col];
            }
        }

        return total;
    }

    // section opg 1.5.1
    public static int getValueAt(int[][] numbers, int row, int col) {
        return numbers[row][col];
    }

    // section opg 1.5.2
    public static void setValueAt(int[][] numbers, int row, int col, int value) {
        numbers[row][col] = value;
    }
}

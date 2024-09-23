package TowerOfHanoi;

public class Main {
    /*
     * Tower of Hanoi moves for n.
     * Moves needed for 1 = 1.
     * Moves needed for 2 = 3.
     * Moves needed for 3 = 7.
     * Moves needed for 4 = 15.
     * Moves needed for n = 2 * (n-1 moves) + 1.
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(moves(i));
        }
    }

    /* Pre: n > 0 */
    public static int moves(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 2 * moves(n-1) + 1;
        }
    }
}

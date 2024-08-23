package classexes;

import java.util.Scanner;

public class opg4 {
    public static void main(String[] args) {
        int[][] seatPrices = {{10,10,10,10,10,10,10,10,10,10},
                              {10,10,10,10,10,10,10,10,10,10},
                              {10,10,10,10,10,10,10,10,10,10},
                              {10,10,20,20,20,20,20,20,10,10},
                              {10,10,20,20,20,20,20,20,10,10},
                              {10,10,20,20,20,20,20,20,10,10},
                              {20,20,30,30,40,40,30,30,20,20},
                              {20,30,30,40,50,50,40,30,30,20},
                              {30,40,50,50,50,50,50,50,40,30}};

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Indtast en billet pris: ");
            int[] available = isTicketAvailable(seatPrices, input.nextInt());
            if (available[0] != 0 & available[1] != 0) {
                System.out.printf("Bedste ledige sæde er på række: %d sæde: %d",
                        available[0], available[1]);
            } else {
                System.out.println("Ingen pladser med denne pris er tilgængelige!");
            }
            System.out.println();
        }

        buyTicket(seatPrices, 4, 5);
        printTheaterFloor(seatPrices);
    }

    public static int[] isTicketAvailable(int[][] seats, int price) {
        int[] available = new int[2];
        boolean found = false;

        for (int row = seats.length-1; found != true & row >= 0; row--) {
            for (int col = 0; found != true & col < seats[row].length; col++) {
                if (seats[row][col] == price) {
                    available[0] = row+1;
                    available[1] = col+1;
                    found = true;
                }
            }
        }

        return available;
    }

    public static boolean buyTicket(int[][] seats, int rowNo, int seatNo) {
        boolean available = false;

        if (seats[rowNo][seatNo] != 0) {
            seats[rowNo-1][seatNo-1] = 0;
            available = true;
        }

        return available;
    }

    public static void printTheaterFloor(int[][] seats) {
        System.out.println("De ledige pladser er angivet med deres pris");
        System.out.print("   Sæde :");
        for (int row = 0; row < seats[1].length; row++) {
            System.out.printf(" %2d", row+1);
        }
        System.out.print("\n          ");
        for (int i = 0; i < (seats[1].length+1)*3-4; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int row = 0; row < seats.length; row++) {
            System.out.printf("Række %2d: ", row+1);
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col] == 0) System.out.print("-- ");
                else System.out.printf("%d ", seats[row][col]);
            }
            System.out.println();
        }
    }
}

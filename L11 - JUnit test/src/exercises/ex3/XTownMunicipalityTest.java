package exercises.ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XTownMunicipalityTest {

    @Test
    public void tc1to10() {
        // Arrange
        XTownMunicipality town = new XTownMunicipality();

        // Act
        int tc1 = town.totalPayment(0, 0);
        int tc2 = town.totalPayment(1, 0);
        int tc3 = town.totalPayment(2, 0);
        int tc4 = town.totalPayment(3, 0);
        int tc5 = town.totalPayment(4, 0);
        int tc6 = town.totalPayment(10, 0);
        int tc7 = town.totalPayment(0, 1);
        int tc8 = town.totalPayment(0, 2);
        int tc9 = town.totalPayment(0, 3);
        int tc10 = town.totalPayment(0, 4);
        int tc11 = town.totalPayment(0, 10);
        int tc12 = town.totalPayment(1, 1);
        int tc13 = town.totalPayment(2, 1);
        int tc14 = town.totalPayment(1, 2);
        int tc15 = town.totalPayment(3, 1);
        int tc16 = town.totalPayment(1, 3);

        // Assert
        assertEquals(0, tc1);
        assertEquals(2000, tc2);
        assertEquals(3500, tc3);
        assertEquals(5000, tc4);
        assertEquals(6000, tc5);
        assertEquals(12000, tc6);
        assertEquals(1000, tc7);
        assertEquals(1750, tc8);
        assertEquals(2500, tc9);
        assertEquals(3000, tc10);
        assertEquals(6000, tc11);

        assertEquals(2750, tc12);
        assertEquals(4250, tc13);
        assertEquals(3500, tc14);
        assertEquals(5500, tc15);
        assertEquals(4000, tc16);
    }
}

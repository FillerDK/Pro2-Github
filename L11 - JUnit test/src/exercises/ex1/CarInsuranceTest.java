package exercises.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {
    @Test
    public void constructTest() {
        // Arrange
        CarInsurance carInsurance = new CarInsurance(1000);

        // Act

        // Assert
        assertEquals(1000, carInsurance.getBasisPremium());
    }

    @Test
    public void validTC1to11() {
        // Arrange
        CarInsurance carInsurance = new CarInsurance(100);

        // Act
        // Border values
        double tc1 = carInsurance.calculatePremium(18, true, 0);
        double tc2 = carInsurance.calculatePremium(25, false, 2);
        double tc3 = carInsurance.calculatePremium(24, false, 3);
        double tc4 = carInsurance.calculatePremium(24, false, 5);
        double tc5 = carInsurance.calculatePremium(25, false, 6);
        double tc6 = carInsurance.calculatePremium(30, false, 8);
        double tc7 = carInsurance.calculatePremium(40, false, 9);
        // Between values
        double tc8 = carInsurance.calculatePremium(20, true, 1);
        double tc9 = carInsurance.calculatePremium(23, false, 4);
        double tc10 = carInsurance.calculatePremium(27, false, 7);
        double tc11 = carInsurance.calculatePremium(50, false, 15);

        // Assert
        // Border values
        assertEquals(120, tc1, 0.0001);
        assertEquals(100, tc2, 0.0001);
        assertEquals(110, tc3, 0.0001);
        assertEquals(110, tc4, 0.0001);
        assertEquals(75, tc5, 0.0001);
        assertEquals(75, tc6, 0.0001);
        assertEquals(65, tc7, 0.0001);
        // Between values
        assertEquals(120, tc8, 0.0001);
        assertEquals(110, tc9, 0.0001);
        assertEquals(75, tc10, 0.0001);
        assertEquals(65, tc11, 0.0001);
    }

    @Test
    public void invalidTC12and13() {
        // Arrange
        CarInsurance carInsurance = new CarInsurance(100);

        // Act & Assert
        Exception ageException = assertThrows(TooYoungException.class,
                () -> carInsurance.calculatePremium(15, false, 0));
        assertEquals(ageException.getMessage(), "Too young!");

        Exception noDMGexception = assertThrows(InvalidYearsException.class,
                () -> carInsurance.calculatePremium(20, false, 4));
        assertEquals(noDMGexception.getMessage(), "Too few years!");
    }
}

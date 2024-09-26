package exercises.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarInsuranceTest {
    @Test
    public void constructTest() {
        // Arrange

        // Act
        CarInsurance carInsurance = new CarInsurance(1000);

        // Assert
        assertEquals(1000, carInsurance.getBasisPremium());
    }
}

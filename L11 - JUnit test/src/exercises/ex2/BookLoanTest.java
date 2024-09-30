package exercises.ex2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BookLoanTest {

    @Test
    public void validTC1to16() {
        // Arrange
        BookLoan bookLoan = new BookLoan();

        // Act
        // Border values
        int tc1 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 2), true);
        int tc2 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 8), true);
        int tc3 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 9), true);
        int tc4 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 15), true);
        int tc5 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 16), true);
        int tc6 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 2), false);
        int tc7 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 8), false);
        int tc8 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 9), false);
        int tc9 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 15), false);
        int tc10 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 16), false);
        // Between values
        int tc11 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 5), true);
        int tc12 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 12), true);
        int tc13 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 20), true);
        int tc14 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 5), false);
        int tc15 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 12), false);
        int tc16 = bookLoan.calculateFine(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 20), false);

        // Assert
        // Border values
        assertEquals(20, tc1);
        assertEquals(20, tc2);
        assertEquals(60, tc3);
        assertEquals(60, tc4);
        assertEquals(90, tc5);
        assertEquals(10, tc6);
        assertEquals(10, tc7);
        assertEquals(30, tc8);
        assertEquals(30, tc9);
        assertEquals(45, tc10);
        // Between values
        assertEquals(20, tc11);
        assertEquals(60, tc12);
        assertEquals(90, tc13);
        assertEquals(10, tc14);
        assertEquals(30, tc15);
        assertEquals(45, tc16);
    }
}

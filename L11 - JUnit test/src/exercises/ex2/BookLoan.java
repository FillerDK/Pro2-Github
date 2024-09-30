package exercises.ex2;

import java.time.LocalDate;

public class BookLoan {

    void BookLoan() {
    }

    /*
     Return the fine according to the table above.
     Pre: calculatedDate < actualDate
          (calculatedDate is the expected return date and
           actualDate is the day you actually return the book)
     */
    public int calculateFine(
                    LocalDate calculatedDate,
                    LocalDate actualDate,
                    boolean adult) {
        int fine = 0;

        if (calculatedDate.isAfter(actualDate)) {
            throw new NoFineException("No fine given!");
        } else {
            if (actualDate.isBefore(calculatedDate.plusDays(8))) {
                if (adult) {
                    fine = 20;
                } else {
                    fine = 10;
                }
            } else if (actualDate.isBefore(calculatedDate.plusDays(15))) {
                if (adult) {
                    fine = 60;
                } else {
                    fine = 30;
                }
            } else {
                if (adult) {
                    fine = 90;
                } else {
                    fine = 45;
                }
            }
        }
        return fine;
    }
}

package exercises.ex3;

public class XTownMunicipality {

    /*
     * Returns the total payment for a family minus discount
     * Pre: small >= 0, big >= 0
     * (small is the number of preschool children
     * and big is the number of children attending school)
     */
    public int totalPayment (int small, int big) {
        int total = 0;
        int childrenCount = small + big;

        if (childrenCount == 0) {
            total = 0;
        } else if (childrenCount == 1) {
            total = small * 2000 + big * 1000;
        } else if (childrenCount <= 3) {
            total = totalPaymentHelper(small, big, 25);
        } else {
            if (small <= 3) {
                switch (small) {
                    case 0: if (small == 0)
                        total = totalPaymentHelper(small, 3, 25) + (big - 3) * 500;
                    case 1: if (small == 1)
                        total = totalPaymentHelper(small, 2, 25) + (big - 2) * 500;
                    case 2: if (small == 2)
                        total = totalPaymentHelper(small, 1, 25) + (big - 1) * 500;
                    case 3: if (small == 3)
                        total = totalPaymentHelper(small, 0, 25) + big * 500;
                }
            } else {
                total = totalPaymentHelper(3, 0, 25);
                total += (small - 3) * 1000 + big * 500;
            }
        }

        return total;
    }

    private int totalPaymentHelper(int small, int big, int percentage) {
        int total = 0;

        if (small > 0) {
            int i = (small - 1) * 2000 + big * 1000;
            total += 2000 + (i * (100-percentage) / 100);
        } else {
            int i = (big - 1) * 1000;
            total += 1000 + (i * (100-percentage) / 100);
        }

        return total;
    }
}

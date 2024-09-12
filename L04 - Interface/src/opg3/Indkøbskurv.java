package opg3;

import java.util.ArrayList;

public class Indkøbskurv {
    ArrayList<Vare> indkøbskurv = new ArrayList<>();

    public void addToBasket(Vare vare) {
        indkøbskurv.add(vare);
    }

    /**
     * Calculating the total price of everything
     * in the basket.
     *
     * @return total price of basket.
     */
    public double calcTotalPrice() {
        double totalPrice = 0;

        for (Vare v : indkøbskurv) {
            totalPrice += v.beregnSalgspris();
        }

        return totalPrice;
    }

    public void printReceipt() {
        for (Vare v : indkøbskurv) {
            System.out.println(v.toString());
        }
        System.out.println("Samlet pris: " + calcTotalPrice());
    }
}

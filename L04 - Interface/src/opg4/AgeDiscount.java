package opg4;

import java.time.LocalDate;

public class AgeDiscount implements Discount {
    private final LocalDate birthday;

    public AgeDiscount(LocalDate birthday) {
        this.birthday = birthday;
    }

    // Returns discount with price
    @Override
    public double discountedPrice(double price) {
        int age = LocalDate.now().getYear() - birthday.getYear();
        double discountedPrice = price;
        if      (age <= 10) {discountedPrice = price * 0.95;}
        else if (age <= 20) {discountedPrice = price * 0.90;}
        else if (age <= 30) {discountedPrice = price * 0.85;}
        else if (age <= 40) {discountedPrice = price * 0.80;}
        else if (age <= 50) {discountedPrice = price * 0.75;}
        else if (age <= 60) {discountedPrice = price * 0.70;}
        else if (age <= 70) {discountedPrice = price * 0.65;}
        else if (age <= 80) {discountedPrice = price * 0.60;}
        else if (age <= 90) {discountedPrice = price * 0.55;}
        else                 discountedPrice = price * 0.50;
        return discountedPrice;
    }

    // Returns a description of the discount
    @Override
    public String description() {
        return String.format("Discount of 5% for every decade " +
                "of survival with a maximum of 50% off!");
    }
}

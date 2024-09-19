package opg4;

public class FixedDiscount implements Discount {
    private final int fixedDiscount = 250; // Discount in fixed amount
    private final int discountLimit = 1000; // Minimum amount needed for the discount to apply

    // Returns a fixed discount
    @Override
    public double discountedPrice(double price) {
        if (price >= discountLimit) {
            return fixedDiscount;
        }
        return 0;
    }

    // Returns a description of the discount
    @Override
    public String description() {
        return String.format("");
    }
}

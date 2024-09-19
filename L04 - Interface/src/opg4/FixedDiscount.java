package opg4;

public class FixedDiscount implements Discount {
    private final int fixedDiscount = 250; // Discount in fixed amount
    private final int discountLimit = 1000; // Minimum amount needed for the discount to apply

    @Override
    public double discountedPrice(double price) {
        return 0;
    }

    @Override
    public String description() {
        return null;
    }
}

package opg3;

public class FixedDiscount extends Discount{
    private final int fixedDiscount = 250; // Discount in fixed amount
    private final int discountLimit = 1000; // Minimum amount needed for the discount to apply

    @Override
    public double getDiscount(double price) {
        if (price >= discountLimit) return fixedDiscount;
        return 0;
    }
}

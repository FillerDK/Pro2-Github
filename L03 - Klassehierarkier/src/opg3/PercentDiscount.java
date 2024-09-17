package opg3;

public class PercentDiscount extends Discount {
    private final int discountPercentage = 15; // Discount as a percentage

    @Override
    public double getDiscount(double price) {
        return price * discountPercentage / 100.0;
    }
}

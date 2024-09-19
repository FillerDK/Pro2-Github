package opg4;

public class PercentDiscount implements Discount{
    private final int discountPercentage = 15; // Discount as a percentage

    // Returns price with discount
    @Override
    public double discountedPrice(double price) {
        return price * discountPercentage / 100.0;
    }

    // Returns a description of the discount
    @Override
    public String description() {
        return String.format("Discount of 15 percent!");
    }
}

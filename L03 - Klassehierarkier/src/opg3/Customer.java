package opg3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private final LocalDate birthday;

    // association 0..* --> 0..1 Discount
    private Discount discount;

    // association 1 --> 0..* Order
    private final ArrayList<Order> orders = new ArrayList<>();

    public Customer(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
        this.discount = null;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public double totalBuy() {
        double total = 0;

        for (Order o : orders) {
            total += o.orderPrice();
        }

        return total;
    }

    // Set the discount for the customer
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    // Calculate the total price with the discount
    public double totalBuyWithDiscount() {
        double totalPrice = totalBuy(); // Get total price without discount
        if (discount != null) {
            double discountAmount = discount.getDiscount(totalPrice);
            return totalPrice - discountAmount; // Apply the discount
        }
        return totalPrice; // No discount, return full price
    }
}

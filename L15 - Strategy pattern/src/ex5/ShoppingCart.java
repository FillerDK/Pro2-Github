package ex5;

import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<Item> cart = new ArrayList<>();
    private int totalPrice = 0;

    void addItem(Item item) {
        cart.add(item);
        totalPrice += item.getPrice();
    }

    void pay(Pay pay) {
        pay.pay(totalPrice);

        // emptying cart
        /*
        cart.clear();
        totalPrice = 0;
         */
    }
}

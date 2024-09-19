package opg4;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // Products
        Product p1 = new Product(1, "Airfryer", 1500);
        Product p2 = new Product(2, "Vandflaske", 25);
        Product p3 = new Product(3, "Mobil", 4500);
        Product p4 = new Product(4, "Skrivebord", 300);
        Product p5 = new Product(5, "Energidrik", 15);

        // Customers
        Customer c1 = new Customer("Finn Petersen", LocalDate.of(1964, 7, 10));
        Customer c2 = new Customer("Mark Swarowski", LocalDate.of(1987, 9, 25));
        Customer c3 = new Customer("Svenn Sigurdsson", LocalDate.of(2000, 1, 4));

        // Orders
        Order o1 = new Order(1);
        Order o2 = new Order(2);
        Order o3 = new Order(3);
        Order o4 = new Order(4);
        Order o5 = new Order(5);
        Order o6 = new Order(6);
        Order o7 = new Order(7);
        Order o8 = new Order(8);
        Order o9 = new Order(9);

        // Orderlines
        OrderLine ol1 = new OrderLine(1, 1, p4);
        OrderLine ol2 = new OrderLine(2, 1, p1);
        OrderLine ol3 = new OrderLine(3, 12, p5);
        OrderLine ol4 = new OrderLine(4, 1, p3);
        OrderLine ol5 = new OrderLine(5, 1, p3);
        OrderLine ol6 = new OrderLine(6, 2, p2);
        OrderLine ol7 = new OrderLine(7, 2, p4);
        OrderLine ol8 = new OrderLine(8, 2, p5);
        OrderLine ol9 = new OrderLine(9, 1, p2);
        OrderLine ol10 = new OrderLine(10, 3, p1);
        OrderLine ol11 = new OrderLine(11, 1, p3);
        OrderLine ol12 = new OrderLine(12, 4, p4);
        OrderLine ol13 = new OrderLine(13, 1, p3);
        OrderLine ol14 = new OrderLine(14, 4, p1);
        OrderLine ol15 = new OrderLine(15, 2, p5);
        OrderLine ol16 = new OrderLine(16, 5, p3);
        OrderLine ol17 = new OrderLine(17, 3, p2);
        OrderLine ol18 = new OrderLine(18, 1, p4);

        // c1 orders
        c1.addOrder(o1);
        c1.addOrder(o2);

        // c2 orders
        c2.addOrder(o3);
        c2.addOrder(o4);
        c2.addOrder(o5);
        c2.addOrder(o6);

        // c3 orders
        c3.addOrder(o7);
        c3.addOrder(o8);
        c3.addOrder(o9);

        // o1 & o2 orderlines
        o1.addOrderLine(ol1);
        o1.addOrderLine(ol2);

        o2.addOrderLine(ol3);
        o2.addOrderLine(ol4);

        // o3-o6 orderlines
        o3.addOrderLine(ol5);
        o3.addOrderLine(ol6);

        o4.addOrderLine(ol7);
        o4.addOrderLine(ol8);

        o5.addOrderLine(ol9);
        o5.addOrderLine(ol10);

        o6.addOrderLine(ol11);
        o6.addOrderLine(ol12);

        // o7-o9 orderlines
        o7.addOrderLine(ol13);
        o7.addOrderLine(ol14);

        o8.addOrderLine(ol15);
        o8.addOrderLine(ol16);

        o9.addOrderLine(ol17);
        o9.addOrderLine(ol18);

        // Assign discounts
        c1.setDiscount(new PercentDiscount());
        c2.setDiscount(new FixedDiscount());
        c3.setDiscount(new AgeDiscount(c3.getBirthday()));

        // Prints
        System.out.println("Total buy for c1: " + c1.totalBuy());
        System.out.println("Total buy with discount for c1: " + c1.totalBuyWithDiscount());
        System.out.println();
        System.out.println("Total buy for c2: " + c2.totalBuy());
        System.out.println("Total buy with discount for c2: " + c2.totalBuyWithDiscount());
        System.out.println();
        System.out.println("Total buy for c3: " + c3.totalBuy());
        System.out.println("Total buy with discount for c3: " + c3.totalBuyWithDiscount());
    }
}

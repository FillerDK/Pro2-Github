package ex5;

public class CreditCardPayment implements Pay {

    private String name;
    private String cardNumber;

    public CreditCardPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Paid with credit card: %d\n", amount);
    }
}

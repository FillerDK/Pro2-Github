package ex5;

public class PaypalPayment implements Pay {

    private String mail;
    private String password;

    public PaypalPayment(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Paid using Paypal: %d\n", amount);
    }
}

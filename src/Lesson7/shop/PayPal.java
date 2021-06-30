package Lesson7.shop;

public class PayPal implements PaymentStrategy{
    private String login;
    private String password;

    public PayPal(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("PayPal payment: " + amount);
    }
}

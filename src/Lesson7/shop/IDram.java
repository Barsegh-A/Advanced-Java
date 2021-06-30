package Lesson7.shop;

public class IDram implements PaymentStrategy{
    private String phone;

    public IDram(String phone) {
        this.phone = phone;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("IDram %s pay amount %d\n", phone, amount);
    }
}

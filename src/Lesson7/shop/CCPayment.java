package Lesson7.shop;

public class CCPayment implements PaymentStrategy{
    private String number;
    private String fullName;
    private String expDate;
    private String cvv;

    public CCPayment(String number, String fullName, String expDate, String cvv) {
        this.number = number;
        this.fullName = fullName;
        this.expDate = expDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Credit Card payment");
        System.out.println("Amount: " + amount);
        System.out.println("Card: " + secureCardNumber());
        System.out.println("Expiration Date: " + expDate);

    }

    private String secureCardNumber(){
        return "************" + number.substring(12);
    }
}

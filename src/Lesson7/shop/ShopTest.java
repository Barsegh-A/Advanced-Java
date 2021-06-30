package Lesson7.shop;

public class ShopTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Item("TV", 200));
        cart.add(new Item("Phone", 1000));

//        cart.pay(new PayPal("aaa", "asd"));
        cart.pay(new CCPayment("1234567812345678", "Barsegh Atanyan", "11/11", "123"));

//        cart.pay(new IDram("123"));

    }
}

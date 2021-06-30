package Lesson7.shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void add(Item item){
        items.add(item);
    }

    public void remove(Item item){
        items.remove(item);
    }

    public int toPay(){
        return items.stream()
                .map(Item::getPrice)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public void pay(PaymentStrategy strategy){
        strategy.pay(toPay());
    }
}

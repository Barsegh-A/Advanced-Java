package Lesson5.ImmutableClasses;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Car c = new Car("BMW", 2000, new Engine("petrol", 2.5));

        System.out.println(c.getModel());
        System.out.println(c.getYear());


        Date d = new Date();
        Human h = new Human("Hayk", d);
        h.printInfo();
        String name = h.getName();
        Date birthday = h.getBirthday();
        birthday.setTime(birthday.getTime() + 1000);
        h.printInfo();

        d.setTime(birthday.getTime() + 2000);
        h.printInfo();
    }
}

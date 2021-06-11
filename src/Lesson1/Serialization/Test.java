package Lesson1.Serialization;

public class Test {

    public static void main(String[] args) {
        User user = new User("log123", "pass111", 2000, true);
        Car car = new Car("BMW");
        user.setCar(car);
        UserService.serializeUser(user);
        System.out.println(user);
        User user2 = UserService.deserializeUser();
        System.out.println(user2);

    }
}

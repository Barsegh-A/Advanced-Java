package Lesson7.builder;

public class Test {
    public static void main(String[] args) {
        User u1 = new User.UserBuilder("ll", "pp").build();
        User u2 = new User.UserBuilder("ll", "pp")
                .admin(true)
                .build();

    }
}

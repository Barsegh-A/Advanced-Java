package Lesson1.JSON;

import com.google.gson.Gson;

public class JSONTest {
    public static void main(String[] args) {
        Human human = new Human("Barsegh", 20);
        Gson g = new Gson();

        String s = g.toJson(human);
        System.out.println(s);

        String ss = "{\"first_name\":\"Barsegh\",\"age\":20}";

        Human h = g.fromJson(ss, Human.class);
        System.out.println(h.getName());
    }
}

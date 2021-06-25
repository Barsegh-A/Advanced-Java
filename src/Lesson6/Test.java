package Lesson6;

public class Test {
    public static void main(String[] args) {
        ConnectionConfig c1 = ConnectionConfig.getInstance();
        ConnectionConfig c2 = ConnectionConfig.getInstance();



        c1.host = "google.com";
        c2.host = "yandex.com";

        System.out.println(c1.host);
    }
}

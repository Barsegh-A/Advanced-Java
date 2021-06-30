package Homework6;

public class Test {

    public static void main(String[] args) {
        ConnectionConfigSerializable c1 = ConnectionConfigSerializable.getInstance();

        c1.host = "picsart.com";
        c1.password = "picsart";

        ConnectionConfigService.serializeConnectionConfig(c1);
        ConnectionConfigSerializable c2 = ConnectionConfigService.deserializeConnectionConfig();

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        c2.host = "google.com";
        System.out.println(c1.host);
        System.out.println(c2.host);

    }
}

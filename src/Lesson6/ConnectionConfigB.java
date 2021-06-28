package Lesson6;

public class ConnectionConfigB {

    public String host;
    public String password;

    private ConnectionConfigB(){

    }

    private static class ConnectionConfigHolder {
        private static final ConnectionConfigB INSTANCE = new ConnectionConfigB();
    }

    public static ConnectionConfigB getInstance(){
        return ConnectionConfigHolder.INSTANCE;
    }
}

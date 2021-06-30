package Lesson6;

public class ConnectionConfig {
    public String host;
    public String password;
    private static volatile ConnectionConfig instance;


    private ConnectionConfig(){

    }

    public static ConnectionConfig getInstance(){
        if(instance == null){
            synchronized (ConnectionConfig.class){
                if(instance == null){
                    instance = new ConnectionConfig();
                }
            }
        }
        return instance;
    }

}

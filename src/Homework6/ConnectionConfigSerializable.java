package Homework6;

import java.io.Serializable;

public class ConnectionConfigSerializable implements Serializable {
    public transient String host;
    public transient String password;
    private static volatile ConnectionConfigSerializable instance;


    private ConnectionConfigSerializable(){

    }

    public static synchronized ConnectionConfigSerializable getInstance(){
        if(instance == null){
            synchronized (ConnectionConfigSerializable.class){
                if(instance == null){
                    instance = new ConnectionConfigSerializable();
                }
            }
        }
        return instance;
    }

    protected Object readResolve(){
        return getInstance();
    }

}

package Homework6;

import java.io.*;

public class ConnectionConfigService {
    public static final String CONFIG_FILE_NAME = "config";

    public static void serializeConnectionConfig(ConnectionConfigSerializable user){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream(CONFIG_FILE_NAME);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(user);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static ConnectionConfigSerializable deserializeConnectionConfig(){
        ConnectionConfigSerializable result = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(CONFIG_FILE_NAME);
            ois = new ObjectInputStream(fis);

            result = (ConnectionConfigSerializable) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

}

package Homework1;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.beans.XMLEncoder;
import java.io.*;

public class XMLTest {

    public static void main(String[] args) throws JAXBException {
        User user = new User("user111", "qwerty", 2000, true, 1);
        user.getPhones().add(new Phone("12345678", "AAA"));
        user.getPhones().add(new Phone("88112299", "BBB"));

        // JAXB issue
//        JAXBContext context = JAXBContext.newInstance(User.class);
//        Marshaller m = context.createMarshaller();
//        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        m.marshal(user, new File("user.xml"));


        // Serialize

        XStream xstream = new XStream(new StaxDriver());
        xstream.processAnnotations(User.class);

        String userXML = xstream.toXML(user);
//        System.out.println(dataXml);


        try(BufferedWriter bw = new BufferedWriter(new FileWriter("user.xml"))) {
            bw.write(userXML);
        } catch (Exception e){
            e.printStackTrace();
        }


        // Deserialize from String
        User userDeserialized = (User) xstream.fromXML(userXML);
        System.out.println(userDeserialized);

        // Deserialize from File
        System.out.println((User) xstream.fromXML(new File("user.xml")));


    }
}

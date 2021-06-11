package Homework1;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XStreamAlias("user")
public class User {
    private String username;
    private String password;
    private int year;
    private boolean isPremium;
    private long id;
    private List<Phone> phones = new ArrayList<>();

    public User(String username, String password, int year, boolean isPremium, long id) {
        this.username = username;
        this.password = password;
        this.year = year;
        this.isPremium = isPremium;
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    @XmlElement
    public void setUsername(String username) {
        this.username = username;
    }

    public int getYear() {
        return year;
    }

    @XmlElement
    public void setYear(int year) {
        this.year = year;
    }

    public String getPassword() {
        return password;
    }

    @XmlTransient
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPremium() {
        return isPremium;
    }

    @XmlElement
    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public long getId() {
        return id;
    }

    @XmlAttribute
    public void setId(long id) {
        this.id = id;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", year=" + year +
                ", isPremium=" + isPremium +
                ", id=" + id +
                ", phones=" + phones +
                '}';
    }
}

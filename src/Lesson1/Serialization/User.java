package Lesson1.Serialization;

import java.io.Serializable;

public class User implements Serializable {

    public static final long serialVersionUID = 945517985227482255L;

    private String login;
    private transient String password;
    private int year;
    private boolean isAdmin;
    private Car car;

    public User(String login, String password, int year, boolean isAdmin){
        this.login = login;
        this.password = password;
        this.year = year;
        this.isAdmin = isAdmin;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getYear() {
        return year;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "Lesson1.Serialization.User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", year=" + year +
                ", isAdmin=" + isAdmin +
                ", car=" + car +
                '}';
    }

    public Car getCar() {
        return (Car) car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

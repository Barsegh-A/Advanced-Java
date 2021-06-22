package Lesson5.ImmutableClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private final String name;
    private final Date birthday;


    public Human(String name, Date birthday) {
        this.name = name;
        this.birthday = (Date) birthday.clone();
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return (Date) birthday.clone();
    }

    public void printInfo(){
        SimpleDateFormat sdf = new SimpleDateFormat();

        System.out.println("Name: " + name);
        System.out.println("Birthday: " + sdf.format(birthday));

    }
}

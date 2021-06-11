package Lesson1.JSON;

import com.google.gson.annotations.SerializedName;

public class Human {
    @SerializedName("first_name")
    private String name;


    private transient int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

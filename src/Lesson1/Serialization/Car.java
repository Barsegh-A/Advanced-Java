package Lesson1.Serialization;

import java.io.Serializable;

public class Car implements Serializable{
    private String model;

    public Car(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

package Lesson5.ImmutableClasses;

public class Engine {
    private String type;
    private double size;

    public Engine(String type, double size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

package Lesson5.ImmutableClasses;

public class Car {
    private final String model;
    private final int year;
    private final Engine engine;

    public Car(String model, int year, Engine engine) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engine.getType(), engine.getSize());
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return new Engine(engine.getType(), engine.getSize());
    }
}

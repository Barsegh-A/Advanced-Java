package Lesson7.factory;

public class ShapeFactory {

    public static Shape create(ShapeType type){
        switch (type){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
        }

        throw new RuntimeException("Invalid shape type.");
    }
}

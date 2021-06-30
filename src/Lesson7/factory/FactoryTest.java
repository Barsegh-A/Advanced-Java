package Lesson7.factory;

public class FactoryTest {
    public static void main(String[] args) {
        Shape c = ShapeFactory.create(ShapeType.CIRCLE);
        c.draw();

        ShapeType.RECTANGLE.draw();
    }

}

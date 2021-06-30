package Lesson7.factory;

public enum ShapeType implements Shape {
    CIRCLE{
        @Override
        public void draw() {
            System.out.println("Drawing a circle...");
        }
    }, RECTANGLE{
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle...");
        }
    };

}

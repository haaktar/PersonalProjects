package Abstraction.ShapePractice;

public class ShapeObjects {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.b = 4;
        triangle.h = 4;

        triangle.area();

        Rectangle rectangle = new Rectangle();
        rectangle.area(4, 5);

        Circle circle = new Circle();
        circle.r = 7.8;
        circle.area();


        Square square = new Square();
        square.area(4);





    }
}

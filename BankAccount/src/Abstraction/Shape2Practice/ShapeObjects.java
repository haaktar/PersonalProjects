package Abstraction.Shape2Practice;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        circle.calculatePerimeter();
        circle.calculateVolume();
        circle.calculateArea();

        Rectangle rectangle = new Rectangle(3,5);

        System.out.println(rectangle);

        System.out.println(circle);
    }
}

package Overriding.OverridingPractice;

public class ShapeObjects {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectengale rectengale = new Rectengale();
        Square square = new Square();

        rectengale.calculatePerimeter(4, 10);
        rectengale.calculateArea(4, 10);

        System.out.println(rectengale);


        circle.calculateArea(3);
        circle.calculatePerimeter(3);

        System.out.println(circle);

        square.calculateArea(5);
        square.calculatePerimeter(5);

        System.out.println(square);


    }
}

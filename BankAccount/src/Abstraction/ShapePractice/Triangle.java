package Abstraction.ShapePractice;

public class Triangle extends Shape {

    double b, h;

    @Override
    public void area() {
        double area = b * h / 2;

        System.out.println(area);

    }
}

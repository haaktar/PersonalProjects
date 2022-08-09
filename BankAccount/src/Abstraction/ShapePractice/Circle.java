package Abstraction.ShapePractice;

public class Circle extends Shape {

    double r;

    public void area() {
        double area = r * 3.14;

        System.out.println(area);

    }
}

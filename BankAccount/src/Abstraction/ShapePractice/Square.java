package Abstraction.ShapePractice;

public class Square extends Shape {

    double a;

    public void area(double a) {

        this.a = a;

        double area = a * a;

        System.out.println("Square area is " + area);

    }
}

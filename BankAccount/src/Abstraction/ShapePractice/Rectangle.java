package Abstraction.ShapePractice;

public class Rectangle extends Shape {

    double w, l;

    public void area(double w, double l) {

        this.l = l;
        this.w = w;

        double area = w * l;

        System.out.println(area);

    }
}

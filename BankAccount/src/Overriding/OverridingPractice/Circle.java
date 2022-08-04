package Overriding.OverridingPractice;

public class Circle extends Shape {

    public double radius;


    public double calculateArea(double radius) {

        this.radius = radius;

        area = radius * 3.14;

        return area;

    }

    public double calculatePerimeter(double radius) {

        this.radius = radius;

        return perimeter = 3.14 * 2 * radius;


    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

package Overriding.OverridingPractice;

public class Shape {

    public double area;
    public double perimeter;

    public double calculateArea() {

        return 0;

    }

    public double calculatePerimeter() {

        return 0;


    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

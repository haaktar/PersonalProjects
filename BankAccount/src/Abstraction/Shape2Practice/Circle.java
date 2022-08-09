package Abstraction.Shape2Practice;

public class Circle extends Shape {

    public double radius;

    static {
        name = "circle";
        hasVolume = true;
    }

    public Circle(double radius) {
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();

    }

    public double calculateArea() {

        return Math.pow(radius, 2) * Math.PI;
    }

    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}

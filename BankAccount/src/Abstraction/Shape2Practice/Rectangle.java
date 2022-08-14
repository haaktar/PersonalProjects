package Abstraction.Shape2Practice;

public class Rectangle extends Shape {

    public double with, length;

    static {
        name = "rectangle";
        hasVolume = true;
    }

    public Rectangle(double with, double length) {
        this.with = with;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();

    }

    @Override
    public double calculateArea() {
        return with * length;
    }

    @Override
    public double calculatePerimeter() {
        return (with + length) * 2;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "with=" + with +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}

package Overriding.OverridingPractice;

public class Rectengale extends Shape {

    public double rectangleSideA;
    public double rectangleSideB;

    public double calculateArea(double rectangleSideA, double rectangleSideB) {

        this.rectangleSideA = rectangleSideA;
        this.rectangleSideB = rectangleSideB;

      return   area = rectangleSideA * rectangleSideB;

    }


    public double calculatePerimeter(double rectangleSideA, double rectangleSideB) {

        this.rectangleSideA = rectangleSideA;
        this.rectangleSideB = rectangleSideB;


       return perimeter = rectangleSideA * 2 + rectangleSideB * 2;
    }

    @Override
    public String toString() {
        return "Rectengale{" +
                "rectangleSideA=" + rectangleSideA +
                ", rectangleSideB=" + rectangleSideB +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

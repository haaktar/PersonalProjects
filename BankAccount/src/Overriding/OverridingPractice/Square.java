package Overriding.OverridingPractice;

public class Square extends Shape {

    public double squareSide;

    public double calculateArea(double squareSide) {

        this.squareSide=squareSide;

       return area = squareSide * squareSide;

    }


    public double calculatePerimeter(double squareSide) {

        this.squareSide=squareSide;

        return perimeter = squareSide * 4;


    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", squareSide=" + squareSide +
                '}';
    }
}

package Inheritance.InheritancePractice;

public class Device {

    public String brand;
    public String model;
    public double price;
    public boolean hasBattery;
    public boolean memory;
    public double screenSize;
    public  static  String madeIn;


    static {
        madeIn = "China";

    }


    public void setInfo(String brand, String model, double price,  boolean hasBattery, boolean memory, double screenSize) {

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasBattery = hasBattery;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", madeIn='" + madeIn + '\'' +
                ", hasBattery=" + hasBattery +
                ", memory=" + memory +
                ", screenSize=" + screenSize +
                '}';
    }
}

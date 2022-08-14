package Abstraction.PhonePractice;

public abstract class Phone {

    public String brand;
    public String model;
    public double price;
    public double size;

    public abstract void calling(long number);

    public abstract void texting(long number);

    public abstract void texting(long number1, long number2);

    public abstract void calling(long number1, long number2);

    public Phone(String brand, String model, double price, double size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", price=" + price + ", size=" + size + '}';
    }
}

package Polymorphism.Phone;

public abstract class Phone {

    public String brand, model, size;
    public double price;


    public Phone(String brand, String model, double price, String size) {

        this.brand = brand;
        this.model = model;
        this.price = price;
        if (price < 0) {
            throw new RuntimeException("Invalid Price");
        }
        this.size = size;

    }


    public abstract void texting(long phoneNumber);

    public abstract void calling(long phoneNumber);
}

package Interface.Phone;

public abstract class Phone {

    public String brand;
    public String model;
    public double price;
    public double size;

    public Phone(String brand, String model, double price, double size) {

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;

    }


    public abstract void texting();

    public abstract void calling();
}

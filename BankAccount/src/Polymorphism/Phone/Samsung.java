package Polymorphism.Phone;

public class Samsung extends Phone implements AndroidApp, Downloadable {

    public Samsung(String model, double price, String size) {
        super("Samsung", model, price, size);
        if (price > 1200) {
            System.out.println("Invalid Price");
        }
    }

    @Override
    public void texting(long phoneNumber) {

        System.out.println("Samsung is texting" + phoneNumber);

    }

    @Override
    public void calling(long phoneNumber) {

        System.out.println("Samsung is calling" + phoneNumber);


    }

    @Override
    public void download() {

        System.out.println("Samsung is texting" + appStoreName);

    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

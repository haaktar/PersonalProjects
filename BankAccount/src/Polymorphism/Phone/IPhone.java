package Polymorphism.Phone;

public class IPhone extends Phone implements AppleApp, Downloadable {


    public IPhone(String model, double price, String size) {
        super("Iphone", model, price, size);

        if (price > 1500) {
            throw new RuntimeException("Invalid Price");
        }
    }


    @Override
    public void texting(long phoneNumber) {

    }

    @Override
    public void calling(long phoneNumber) {

    }

    @Override
    public void download() {

        System.out.println("IPhone is downloading from " + appStoreName);

    }

    public void faceTiming(long phoneNumber){

        System.out.println("Face Timing");
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

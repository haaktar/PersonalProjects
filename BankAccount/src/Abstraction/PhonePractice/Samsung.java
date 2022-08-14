package Abstraction.PhonePractice;

public class Samsung extends Phone {


    public Samsung(String model, double price, double size) {
        super("Samsung", model, price, size);

        if (price <= 1200) {
            throw new RuntimeException("Invalid Price" + price);
        }
    }

    @Override
    public void calling(long number) {
        System.out.println("Samsung is calling " + number);
    }

    @Override
    public void texting(long number) {
        System.out.println("Samsung is texting " + number);
    }

    public void texting(long number1, long number2) {
        texting(number1);
        texting(number2);
    }

    public void freezing() {
        System.out.println(brand + " is freezing");

    }

    public void calling(long number1, long number2) {
        calling(number1);
        calling(number2);
    }


    @Override
    public String toString() {
        return "Samsung{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", price=" + price + ", size=" + size + '}';
    }
}

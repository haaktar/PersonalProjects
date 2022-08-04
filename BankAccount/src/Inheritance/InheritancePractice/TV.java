package Inheritance.InheritancePractice;

public class TV extends Device {

    public boolean remoteControl;

    public TV(String brand, String model, double price, String madeIn, boolean hasBattery, boolean memory, double screenSize, boolean remoteControl) {

        setInfo("APple", "XMAX", 12344, true, true, 12.2);

        this.remoteControl = remoteControl;

    }

    public void watch() {

        System.out.println("Watching" + model + brand);

    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", memory=" + memory +
                ", screenSize=" + screenSize +
                ", remoteControl=" + remoteControl +
                '}';
    }
}


package Inheritance.InheritancePractice;

public class Phone extends Device {

    public static boolean hasSimCard =true;
    public String OS;

    public Phone(String brand, String model, double price, boolean hasBattery, boolean memory, String OS) {

        setInfo("Sam", "models", 1234.22, true, true, 11.2);
        this.OS=OS;

    }

    public void text(){

        System.out.println(brand + " Tecting");
    }

    public void call(){

        System.out.println(model + " Calling");
    }
}
